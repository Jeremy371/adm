package com.bdp.adm.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bdp.adm.biz.TitleNameBiz;
import com.bdp.adm.vo.UserVO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
@RequestMapping(value = "/tn")
public class TitleNameCtrl {
	@Autowired
	private TitleNameBiz titleNameBiz;
	
	@RequestMapping(value = "/titleNameList", method = RequestMethod.GET)
	public String getTitleNameList() {
		
		return "titleNameList";
	}
	
	// Select
	@RequestMapping(value = "/selectAllTitleName", method = RequestMethod.GET, produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String selectAllTitleName(String action) throws JsonProcessingException {
		
		return titleNameBiz.selectAllTitleName(action);
	}
	
	// Edit
	@RequestMapping(value = "/editTitleName", method = RequestMethod.POST, produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String editTitleName(@RequestBody String responseData, HttpServletRequest request) throws URISyntaxException, JsonMappingException, IOException {
		try {
			UserVO user = (UserVO) request.getSession().getAttribute("user");
			String currentUser = user.getUniqueHash();			
			String RegPtn4Action = "action=";
			String tempData = new java.net.URI(responseData).getPath();
			tempData = URLDecoder.decode(tempData, "UTF-8");
			String[] data = tempData.split("&");
			String action = data[0].split(RegPtn4Action)[1];
			int res = 0;
			
			if(action.equals("create")) {
				System.out.println("### CREATE ###");
				res = titleNameBiz.insertTitleName(data, currentUser);
				System.out.println("CREATE RESULT: " + res);
			}
			else if (action.equals("edit")) {
				System.out.println("### EDIT ###");
				res = titleNameBiz.updateTitleName(data, currentUser);
				System.out.println("EDIT RESULT: " + res);
			}
			else if (action.equals("remove")) {
				System.out.println("### REMOVE ###");
				res = titleNameBiz.deleteTitleName(data, currentUser);
				System.out.println("DELETE RESULT: " + res);
			}
			
			if (res != 1) {
				throw new Exception("Res is not 1");
			}
			
			return this.selectAllTitleName(action);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			Map<String, Object> tmpData  = new HashMap<String, Object>();
			tmpData.put("error", "데이터 입력이 잘못되었거나, 중복된 데이터를 입력하셨습니다.");
			
			ObjectMapper mapper = new ObjectMapper();
			return mapper.writeValueAsString(tmpData);
		}
			
	}
	

}
