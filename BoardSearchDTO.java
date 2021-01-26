package com.naver.erp;
//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
// 게시판 검색 조건을 저장하는 [BoardSearchDTO 클래스] 선언
//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
public class BoardSearchDTO {
	//*****************************
	// 속성변수 선언
	//*****************************
	//-----------------------------
	// 검색 키워드 저장하는 속성변수 선언
	//-----------------------------
	private String keyword1;
	//-----------------------------
	public String getKeyword1() {
		return keyword1;
	}
	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}
	
}
