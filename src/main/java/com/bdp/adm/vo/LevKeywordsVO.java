package com.bdp.adm.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LevKeywordsVO {
	
	@JsonProperty("DT_RowId")
	private String DTRowId;
	
	private int seqKeyword;
	private String level1;
	private String level2;
	private String level3;
	
	private String keyword1;
	private String keyword2;
	private String keyword3;
	private String keyword4;
	private String keyword5;
	private String keyword6;
	private String keyword7;
	private String keyword8;
	private String keyword9;
	private String keyword10;
	private String keyword11;
	private String keyword12;
	private String keyword13;
	private String keyword14;
	private String keyword15;
	
	private String delCd;
	
	private String loadDate;
	private String loadName;
	private String updateDate;
	private String updateName;
	
	@JsonProperty("DT_RowId")
	public String getDTRowId() {
		return DTRowId;
	}
	@JsonProperty("DT_RowId")
	public void setDTRowId(String dTRowId) {
		DTRowId = dTRowId;
	}
	public int getSeqKeyword() {
		return seqKeyword;
	}
	public void setSeqKeyword(int seqKeyword) {
		this.seqKeyword = seqKeyword;
	}
	public String getLevel1() {
		return level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}
	public String getLevel2() {
		return level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}
	public String getLevel3() {
		return level3;
	}
	public void setLevel3(String level3) {
		this.level3 = level3;
	}
	public String getKeyword1() {
		return keyword1;
	}
	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}
	public String getKeyword2() {
		return keyword2;
	}
	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}
	public String getKeyword3() {
		return keyword3;
	}
	public void setKeyword3(String keyword3) {
		this.keyword3 = keyword3;
	}
	public String getKeyword4() {
		return keyword4;
	}
	public void setKeyword4(String keyword4) {
		this.keyword4 = keyword4;
	}
	public String getKeyword5() {
		return keyword5;
	}
	public void setKeyword5(String keyword5) {
		this.keyword5 = keyword5;
	}
	public String getKeyword6() {
		return keyword6;
	}
	public void setKeyword6(String keyword6) {
		this.keyword6 = keyword6;
	}
	public String getKeyword7() {
		return keyword7;
	}
	public void setKeyword7(String keyword7) {
		this.keyword7 = keyword7;
	}
	public String getKeyword8() {
		return keyword8;
	}
	public void setKeyword8(String keyword8) {
		this.keyword8 = keyword8;
	}
	public String getKeyword9() {
		return keyword9;
	}
	public void setKeyword9(String keyword9) {
		this.keyword9 = keyword9;
	}
	public String getKeyword10() {
		return keyword10;
	}
	public void setKeyword10(String keyword10) {
		this.keyword10 = keyword10;
	}
	public String getKeyword11() {
		return keyword11;
	}
	public void setKeyword11(String keyword11) {
		this.keyword11 = keyword11;
	}
	public String getKeyword12() {
		return keyword12;
	}
	public void setKeyword12(String keyword12) {
		this.keyword12 = keyword12;
	}
	public String getKeyword13() {
		return keyword13;
	}
	public void setKeyword13(String keyword13) {
		this.keyword13 = keyword13;
	}
	public String getKeyword14() {
		return keyword14;
	}
	public void setKeyword14(String keyword14) {
		this.keyword14 = keyword14;
	}
	public String getKeyword15() {
		return keyword15;
	}
	public void setKeyword15(String keyword15) {
		this.keyword15 = keyword15;
	}
	public String getDelCd() {
		return delCd;
	}
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	public String getLoadDate() {
		String myDate = loadDate;
		if (loadDate != null) myDate = loadDate.split("\\.")[0];
		return myDate;

	}
	public void setLoadDate(String loadDate) {
		this.loadDate = loadDate;
	}
	public String getLoadName() {
		return loadName;
	}
	public void setLoadName(String loadName) {
		this.loadName = loadName;
	}
	public String getUpdateDate() {
		String myDate = updateDate;
		if (updateDate != null) myDate = updateDate.split("\\.")[0];
		return myDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateName() {
		return updateName;
	}
	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	
	

	
	
	

	
	
}
