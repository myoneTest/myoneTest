package net.daum.myone.frontapi.mvc.persistence;

import java.util.List;

import net.daum.myone.frontapi.mvc.entity.ContentCond;
import net.daum.myone.frontapi.mvc.entity.EventContent;

public interface ContentMapper {

	List<EventContent> getEventContSetList(ContentCond cCond);

}
