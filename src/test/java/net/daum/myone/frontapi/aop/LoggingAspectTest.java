package net.daum.myone.frontapi.aop;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/root-context.xml","classpath:spring/servlet-context.xml" })
public class LoggingAspectTest {

	@Autowired
    private WebApplicationContext wac;
	
	private MockMvc mockMvc;
		
	@Before
	public void setUp() throws Exception {
//		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void aop로그테스트() throws Exception {
		String url = "/aop";
		this.mockMvc.perform(get(url))
							.andExpect(status().isOk());
	}
	
	@Test
	public void aop에러로그테스트() throws Exception {
		String url = "/aop/error";
		this.mockMvc.perform(get(url))
							.andExpect(status().is(999));
	}

}
