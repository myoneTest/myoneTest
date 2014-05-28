package net.daum.myone.frontapi.mvc.controller;


import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.daum.myone.frontapi.exception.ErrorMessage;
import net.daum.myone.frontapi.exception.JsonException;
import net.daum.myone.frontapi.mvc.entity.Cache;
import net.daum.myone.frontapi.mvc.entity.zipcode.Address;
import net.daum.myone.frontapi.mvc.entity.zipcode.Channel;
import net.daum.myone.frontapi.mvc.entity.zipcode.Data;
import net.daum.myone.frontapi.util.HttpRequestUtil;
import net.daum.myone.frontapi.util.JsonResult;
import net.daum.myone.frontapi.util.StringUtil;
import net.daum.myone.frontapi.util.XStreamUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CacheTestController {
	
	private Logger log = LoggerFactory.getLogger(CacheTestController.class);
	
	private static int requestCnt = 0;
	
	
	@Value("#{etcConfig['daum.api.address.url']}") 
	private String addressUrl;
	
	@RequestMapping("/etag/json/test")
	public @ResponseBody Cache cacheTest() {
		log.info("cache Test in");
		Cache cache = new Cache();
		log.info("requestCnt : "+requestCnt);
		if( requestCnt == 3 ) {
			cache.setStatus("etag1");
		} else {
			cache.setStatus("etag2");
			requestCnt++;
		}
		return cache;
	}
	
	@RequestMapping("/property")
	public @ResponseBody String getProperty() {
		return addressUrl;
	}
	
	@RequestMapping(value = "/xml/zipcode/address")
	public @ResponseBody JsonResult<Object> address(@RequestParam(value="q", required=false) String q, @RequestParam(value="page", required=false) String page) throws Exception {
		if ( q == null ) {
			throw new JsonException(ErrorMessage.REQURIED_PARAMETER_NOT_FOUND);
		}
		
		JsonResult<Object> resultJson = new JsonResult<Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, String> param = new HashMap<String, String>();
		param.put("ie", "utf-8");
		param.put("type", "number");
		param.put("lpp", "10");
		param.put("q", URLEncoder.encode(q, "utf-8"));
		param.put("page", StringUtil.checkEmpty(page, "1"));
		
		String resultString = HttpRequestUtil.getRequestAndresponseByParam(addressUrl, "utf-8", param);
		List<Address> addresslist = new ArrayList<Address>();
		try {
			Channel channel = XStreamUtil.toObject(resultString, Channel.class);
			if(channel!=null && channel.getHeader()!=null && channel.getHeader().getCount()>0) {			
				for(int i=0;i<channel.getDs().size();i++) {
					Data data = channel.getDs().get(i);				
					addresslist.add(data.convertToAddress());				
				}
			}
		    map.put("addressList", addresslist);
		    resultJson.setResultList(map);
		    log.debug(resultJson.toString());
		} catch(Exception e) {
			throw new JsonException(ErrorMessage.XML_PARSING_ERROR);
		}
		System.out.println(resultJson);
		return resultJson;	
	}
	
	@RequestMapping(value = "/exception", method=RequestMethod.POST)
	public @ResponseBody String exceptionTest() {
		return "exception";
	}
}
