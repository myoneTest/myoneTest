package net.daum.myone.frontapi.controller;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.env.MockPropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/root-context.xml","classpath:spring/servlet-context.xml" })
public class CacheTestControllerTest {

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
	public void getProperties_테스트() throws Exception {
		String url = "/property";
		MvcResult mvcresult = this.mockMvc.perform(get(url)
							)
							.andDo(print())
							.andExpect(status().isOk())
							.andReturn();
		System.out.println(mvcresult.getResponse().getContentAsString());
		assertTrue(mvcresult.getResponse().getContentAsString().trim().equals("\"http://direct.search.daum.net/search_direct/zipcodeApi.daum?\""));
	}
	
	@Test
	public void etag_json_테스트() throws Exception {
		String url = "/etag/json/test";
		MvcResult mvcresult = this.mockMvc.perform(get(url)
							)
							.andDo(print())
							.andExpect(status().isOk())
							.andReturn();
		System.out.println(mvcresult.getResponse().getContentAsString());
		assertTrue(mvcresult.getResponse().getContentAsString().trim().equals("\"http://direct.search.daum.net/search_direct/zipcodeApi.daum?\""));
	}
	
	@Test
	public void getAddress_성공테스트() throws Exception {
		String url = "/xml/zipcode/address";
		MvcResult mvcresult = this.mockMvc.perform(get(url).
										param("q", "한남동").
										param("page", "1")
							)
							.andDo(print())
							.andExpect(status().isOk())
							.andReturn();
		String resultContent = mvcresult.getResponse().getContentAsString();
		assertTrue(resultContent.indexOf("\"resultMsg\":\"성공\"")>-1);
		assertTrue(resultContent.indexOf("\"resultCode\":\"Y\"")>-1);
	}
	
	@Test
	public void getAddress_q파라미터_없을때_에러_테스트() throws Exception {
		String url = "/xml/zipcode/address";
		MvcResult mvcresult = this.mockMvc.perform(get(url)
							)
							.andDo(print())
							.andExpect(status().is(999))
							.andReturn();
		String resultContent = mvcresult.getResponse().getContentAsString();
		assertTrue(resultContent.indexOf("\"resultMsg\":\"필수파라미터가 없습니다.\"")>-1);
		assertTrue(resultContent.indexOf("\"resultCode\":\"E\"")>-1);
	}

	
	@Test
	public void http_404Status테스트() throws Exception {
		String url = "/exception11";
		this.mockMvc.perform(get(url)
							)
							.andDo(print())
							.andExpect(status().isNotFound());
	}
}
