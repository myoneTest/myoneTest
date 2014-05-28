package net.daum.myone.frontapi.mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.daum.myone.frontapi.mvc.entity.Event;
import net.daum.myone.frontapi.mvc.entity.EventContent;
import net.daum.myone.frontapi.mvc.entity.MyoneCard;
import net.daum.myone.frontapi.mvc.entity.Notice;
import net.daum.myone.frontapi.mvc.service.EventContentService;
import net.daum.myone.frontapi.mvc.service.EventService;
import net.daum.myone.frontapi.mvc.service.MyoneCardService;
import net.daum.myone.frontapi.mvc.service.NoticeService;
import net.daum.myone.frontapi.util.JsonResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MembershipJsonController {
	
	@Autowired
	MyoneCardService myoneCardService;
	
	@Autowired
	NoticeService noticeService;
	
	@Autowired
	EventService eventService;
	
	@Autowired
	EventContentService eventContentService;
	
//	@RequestMapping(value="/json/membership/listCompMain", method=RequestMethod.POST)
	@RequestMapping(value="/json/membership/listCompMain")
	@ResponseBody
	public JsonResult<Object> listCompMainJson(@RequestParam("userseq") String userseq, 
															@RequestParam(value="myoneid", required=false) String myoneid, 
															@RequestParam(value="failcompids", required=false) String failcompids, 
															@RequestParam(value="banimgcd", required=false) String banimgcd)  throws Exception {
		JsonResult<Object> resultJson = new JsonResult<Object>();
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<MyoneCard> myoneCardList = myoneCardService.getMyoneCardList(userseq, banimgcd, banimgcd);
		List<Notice> noticeList = noticeService.getNoticeList(userseq);
		List<Event> eventList = eventService.getEventList(userseq);
		List<EventContent> eventContentList = eventContentService.getEventContentList(userseq);
		
		map.put("myonecardList", myoneCardList);
		map.put("noticeList", noticeList);
		map.put("eventList", eventList);
		map.put("eventContentList", eventContentList);
		resultJson.setResultList(map);
		
		return resultJson;
	}
}
