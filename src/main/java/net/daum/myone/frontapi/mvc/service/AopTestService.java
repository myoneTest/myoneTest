package net.daum.myone.frontapi.mvc.service;


import net.daum.myone.frontapi.util.LoggerHelper;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AopTestService {
	private static Logger log = LoggerHelper.getLogger();
	
	public String aopTestService() {
		log.info("[aop service start!!]");
		log.info("[aop service end!!]");
		return "aopTest Service";
	}
}
