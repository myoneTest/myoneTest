package net.daum.myone.frontapi.mvc.service;

import net.daum.myone.frontapi.mvc.entity.user.User;
import net.daum.myone.frontapi.mvc.persistence.user.UserMapper;
import net.daum.myone.frontapi.util.LoggerHelper;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AndroidTestService {
	
	private Logger log = LoggerHelper.getLogger();
	
	@Autowired
	UserMapper userMapper;
	
	public User getUserInfo(String userseq) {
		
		User user = userMapper.getUserInfo(userseq);
		
		System.out.println("User data={}" + ToStringBuilder.reflectionToString(user, ToStringStyle.MULTI_LINE_STYLE));
		log.info("User data={}" , ToStringBuilder.reflectionToString(user, ToStringStyle.MULTI_LINE_STYLE));
		
		return user;
	}
	
}
