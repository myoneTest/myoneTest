package net.daum.myone.frontapi;

import static org.junit.Assert.*;
import net.daum.myone.frontapi.util.LoggerHelper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;

public class LoggerHelperTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Logger logger = LoggerHelper.getLogger();
		logger.debug("test");
	}

}
