package net.daum.myone.frontapi.interceptor;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.daum.myone.frontapi.util.LoggerHelper;

import org.slf4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class ControllerInterceptor implements HandlerInterceptor {
	
	private Logger log = LoggerHelper.getLogger();
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		checkUUID(request);
		log.debug(request.getAttribute("UUID")+" preHandle");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mnv) throws Exception {
		log.debug(request.getAttribute("UUID")+" postHandle");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		log.debug(request.getAttribute("UUID")+" afterCompletion");
	}

	private void checkUUID(HttpServletRequest request) {
		request.setAttribute("UUID", UUID.randomUUID().toString().replaceAll("-", ""));
	}

}
