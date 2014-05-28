package net.daum.myone.frontapi.mvc.persistence;

import java.util.List;

import net.daum.myone.frontapi.mvc.entity.Event;
import net.daum.myone.frontapi.mvc.entity.EventCond;

public interface EventMapper {

	List<Event> getEventList(EventCond eventCond);

}
