package net.daum.myone.frontapi.mvc.persistence;

import java.util.List;

import net.daum.myone.frontapi.mvc.entity.MyoneCard;
import net.daum.myone.frontapi.mvc.entity.MyoneCardCond;

public interface MyoneCardMapper {

	List<MyoneCard> getJoinMyoneCardList(MyoneCardCond cardCond);

}
