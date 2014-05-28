package net.daum.myone.frontapi.mvc.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.daum.myone.frontapi.mvc.entity.MyoneCardCond;
import net.daum.myone.frontapi.mvc.entity.MyoneCont;
import net.daum.myone.frontapi.mvc.entity.MyoneCard;
import net.daum.myone.frontapi.mvc.persistence.CompMapper;
import net.daum.myone.frontapi.mvc.persistence.ContentMapper;
import net.daum.myone.frontapi.mvc.persistence.MyoneCardMapper;
import net.daum.myone.frontapi.util.LoggerHelper;

@Service
public class MyoneCardService {
	
	private Logger log = LoggerHelper.getLogger();
	
	@Autowired
	MyoneCardMapper myoneCardMapper;
	
	@Autowired
	CompMapper compMapper;
	
	@Autowired
	ContentMapper contentMapper;
	
	public List<MyoneCard> getMyoneCardList(String userseq, String myoneid, String failcompids ) {
		
		MyoneCardCond cardCond = new MyoneCardCond();
		cardCond.setPagingflag("N");
		cardCond.setCiCond(userseq);
		cardCond.setUserseqCond(userseq);
		cardCond.setOrderCardgodsidCond("1006");
		//cardCond.setOrderMyoneidCond(myoneid);
		List<MyoneCard> resultMyoneCardList = myoneCardMapper.getJoinMyoneCardList(cardCond);
		
//		List<Map<String, String>> myeventlist = contentMapper.getMyContEventList();
		
		if(resultMyoneCardList != null) {
			
			for(MyoneCard myoneCard : resultMyoneCardList) {
//				
//				if(MyoneCont.MYONECARD_REGTYPE_A.equals(myoneCard.getRegtype())){
//					myoneCard.setDelyn("N");
//				}else{
//					myoneCard.setDelyn("Y");
//				}
//				
//				if(myoneCard.getMyoneid().equals(myoneid)) {
//					myoneCard.setSelectflag("Y");
//				}
				
				
				//checkRule 비지니스 로직 생략
//				CompCond compCond = new CompCond();
//				compCond.setRegtypeCond("B");
//				compCond.setPagingflag("N");
//				compCond.setMyoneidCond(myoneCard.getMyoneid());				
//				compCond.setRegtypesCond(new String[]{FrontCont.COMP_REGTYPE_B, FrontCont.COMP_REGTYPE_C});
//				compCond.setUserseqCond(userseq);
//				if(myoneCard.getMyoneid().equals(myoneid) && StringUtil.isNotEmpty(failcompids)) {
//					compCond.setFailcompidsCond(failcompids);
//				}
//				List<Comp> complist = compMapper.getJoinCompList(compCond);
//				checkRule(complist, myeventlist);
				
			}
			
		}
		
		return resultMyoneCardList;
	}
	
}
