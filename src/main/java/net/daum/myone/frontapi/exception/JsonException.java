package net.daum.myone.frontapi.exception;

public class JsonException extends RuntimeException {
	
	public JsonException(ErrorMessage error) {
		super(error.getMsg());
	}
	
}
