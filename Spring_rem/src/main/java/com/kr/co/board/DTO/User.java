package com.kr.co.board.DTO;

public class User {

	/** 사용자 ID*/
	private String userId;
	
	/** 패스워드 */
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
