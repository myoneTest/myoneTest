package net.daum.myone.frontapi.mvc.persistence;

import java.util.List;

import net.daum.myone.frontapi.mvc.entity.Notice;
import net.daum.myone.frontapi.mvc.entity.NoticeCond;

public interface NoticeMapper {

	List<Notice> getNoticeList(NoticeCond noticeCond);

}
