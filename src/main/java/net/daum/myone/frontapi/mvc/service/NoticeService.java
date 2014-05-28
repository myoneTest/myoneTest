package net.daum.myone.frontapi.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.daum.myone.frontapi.mvc.entity.Notice;
import net.daum.myone.frontapi.mvc.entity.NoticeCond;
import net.daum.myone.frontapi.mvc.persistence.NoticeMapper;

@Service
public class NoticeService {
	
	@Autowired
	NoticeMapper noticeMapper;
	
	public List<Notice> getNoticeList(String userseq) {
		NoticeCond noticeCond = new NoticeCond();
		noticeCond.setStartnum(1);
		noticeCond.setFinishnum(3);
		noticeCond.setDisplaytypeCond("APP");		
		noticeCond.setMaindisplayynCond("Y");
		noticeCond.setOrdertypeCond("B");
		noticeCond.setUserseq(userseq);
		List<Notice> resultNoticelist = noticeMapper.getNoticeList(noticeCond);
		return resultNoticelist;
	}

}
