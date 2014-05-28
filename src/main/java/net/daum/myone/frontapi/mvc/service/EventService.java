package net.daum.myone.frontapi.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.daum.myone.frontapi.mvc.entity.Event;
import net.daum.myone.frontapi.mvc.entity.EventCond;
import net.daum.myone.frontapi.mvc.persistence.EventMapper;

@Service
public class EventService {
	
	@Autowired
	EventMapper eventMapper;
	
	public List<Event> getEventList(String userseq) {
		EventCond eventCond = new EventCond();
		eventCond.setStartnum(1);
		eventCond.setFinishnum(3);
		eventCond.setDisplaytypeCond("APP");
		eventCond.setMaindisplayynCond("Y");
		eventCond.setOrdertypeCond("B");
		eventCond.setUserseqCond(userseq);
		eventCond.setDateCond("Y");
		return eventMapper.getEventList(eventCond);
	}

}
