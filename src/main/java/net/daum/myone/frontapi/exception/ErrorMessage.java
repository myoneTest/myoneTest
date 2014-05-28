package net.daum.myone.frontapi.exception;

public enum ErrorMessage {
	REQURIED_PARAMETER_NOT_FOUND ("필수파라미터가 없습니다."), 
	XML_PARSING_ERROR("XML파싱 에러");
	
	private String msg;
	
	private ErrorMessage(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}
