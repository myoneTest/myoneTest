package net.daum.myone.frontapi.exception;

import javax.servlet.http.HttpServletResponse;

import net.daum.myone.frontapi.util.JsonResult;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ResponseErrorExceptionHandler {
	
	private int jsonErrorStatus = 999;
	
	@ExceptionHandler(JsonException.class)
	public @ResponseBody JsonResult<Object> handleException(JsonException ex, HttpServletResponse response) {
		JsonResult<Object> result = new JsonResult<Object>();
		result.setResultMsg(ex.getMessage());
		response.setStatus(jsonErrorStatus);
		return result;
	}
}
