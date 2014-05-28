package net.daum.myone.frontapi.mvc.persistence.user;

import net.daum.myone.frontapi.mvc.entity.user.User;

public interface UserMapper {

	public User getUserInfo(String userseq);

}
