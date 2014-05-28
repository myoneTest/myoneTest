package net.daum.myone.frontapi.mvc.persistence;

import org.apache.ibatis.annotations.Param;

public interface LogMapper {
	void writeLog(@Param("content") String content, @Param("uuid") String uuid);
}
