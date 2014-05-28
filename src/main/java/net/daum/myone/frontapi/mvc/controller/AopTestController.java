package net.daum.myone.frontapi.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import net.daum.myone.frontapi.exception.ErrorMessage;
import net.daum.myone.frontapi.exception.JsonException;
import net.daum.myone.frontapi.mvc.service.AopTestService;
import net.daum.myone.frontapi.util.LoggerHelper;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AopTestController {
	private Logger log = LoggerHelper.getLogger();
	
	@Autowired
	AopTestService aopTestService;
	
	@RequestMapping("/aop")
	public @ResponseBody String aop(HttpServletRequest request) throws Exception {
		log.debug(request.getAttribute("UUID")+" [aop controller start!!]");
		aopTestService.aopTestService();
		log.debug("[aop controller end!!]");
		return "[aop controller getProperty return]";
	}
	
	@RequestMapping("/aop/error")
	public @ResponseBody String aopError() throws Exception {
		log.debug("[aop controller error start!!]");
		throw new JsonException(ErrorMessage.XML_PARSING_ERROR);
	}
}
