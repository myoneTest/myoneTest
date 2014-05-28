package net.daum.myone.frontapi.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import net.daum.myone.frontapi.mvc.entity.user.User;
import net.daum.myone.frontapi.mvc.service.AndroidTestService;
import net.daum.myone.frontapi.util.JsonResult;
import net.daum.myone.frontapi.util.LoggerHelper;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AndroidTestController {
	private Logger log = LoggerHelper.getLogger();
	
	@Autowired
	AndroidTestService androidTestService;

	JsonResult<Object> resultJson = new JsonResult<Object>();
	Map<String, Object> map = new HashMap<String, Object>();
	
	@RequestMapping(value="/search/user/getUserInfo")
	@ResponseBody
	public JsonResult<Object> getUserInfo(@RequestParam("userseq") String userseq )  throws Exception {
		
		User user = androidTestService.getUserInfo(userseq);
		
		map.put("userinfo", user);
		
		resultJson.setResultList(map);
		
		return resultJson;
	}
}
