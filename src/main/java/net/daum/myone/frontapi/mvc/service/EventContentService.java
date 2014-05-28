package net.daum.myone.frontapi.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.daum.myone.frontapi.mvc.entity.ContentCond;
import net.daum.myone.frontapi.mvc.entity.EventContent;
import net.daum.myone.frontapi.mvc.persistence.ContentMapper;

@Service
public class EventContentService {
	
	@Autowired
	ContentMapper contentMapper;
	
	public List<EventContent> getEventContentList(String userseq) {
		ContentCond cCond = new ContentCond();
		cCond.setStartnum(1);
		cCond.setFinishnum(3);
		cCond.setAreaidsCond(new String[]{"A_APP_EVENT_TOP", "A_APP_EVENT_BODY"});
		cCond.setRandomynCond("Y");
		cCond.setMainynCond("Y");
		return contentMapper.getEventContSetList(cCond);
	}

}
