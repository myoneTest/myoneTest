package net.daum.myone.frontapi.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerHelper {
	public static Logger getLogger() {
		return LoggerFactory.getLogger(new Throwable().getStackTrace()[1].getClassName());
	}
}
