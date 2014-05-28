	package net.daum.myone.frontapi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpRequestUtil {
	private static final Logger log = LoggerFactory.getLogger(HttpRequestUtil.class);
	private static final String defaultEncode = "KSC5601";
	private static final int defaultConnetionTimeout = 500;
	private static final int defaultSocketTimeout = 3000;

	public static int requestAndResponseCode(String endPoint) {
		return requestAndResponseCode(endPoint, defaultConnetionTimeout, defaultSocketTimeout);
	}

	public static int requestAndResponseCode(String endPoint, int conTimeOut, int soTimeOut) {
		HttpClient hc = new HttpClient();
		HttpMethod m = new GetMethod(endPoint);
		hc.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeOut);
		hc.getHttpConnectionManager().getParams().setSoTimeout(soTimeOut);
		m.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3, false));
		int statusCode = 404;
		try {
			statusCode = hc.executeMethod(m);
		} catch (IOException e) {
			log.info("reqest ERROR " + endPoint);
		} finally {
			m.releaseConnection();
		}
		return statusCode;
	}

	public static String requestAndresponse(String endPoint) throws IOException {
		return requestAndresponse(endPoint, defaultConnetionTimeout, defaultSocketTimeout, defaultEncode, false);
	}

	public static String requestAndresponse(String endPoint, String encode) throws IOException {
		return requestAndresponse(endPoint, defaultConnetionTimeout, defaultSocketTimeout, encode, false);
	}

	public static String requestAndresponse(String endPoint, int conTimeOut, int soTimeOut) throws IOException {
		return requestAndresponse(endPoint, conTimeOut, soTimeOut, defaultEncode, false);
	}

	public static String requestAndresponse(String endPoint, int conTimeOut, int soTimeOut, String encode, boolean isCarriageReturn) throws IOException {
		StringBuffer buffer = new StringBuffer();
		BufferedReader bReader = null;
		HttpClient httpClient = new HttpClient();
		// httpClient.getParams().setParameter("http.protocol.version",
		// HttpVersion.HTTP_1_0);
		HttpMethod method = new GetMethod(endPoint);
		try {
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeOut);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(soTimeOut);
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(1, false));
			int statusCode = httpClient.executeMethod(method);
			method.addRequestHeader(new Header("Content-Type", "text/html; charset=" + encode));
			// if( endPoint.startsWith("http://10.10.229.14")) {
			// System.out.println(statusCode+"  : "+endPoint);
			// }
			if (statusCode == HttpStatus.SC_OK) {
				bReader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encode));

				String str;
				while ((str = bReader.readLine()) != null) {
					buffer.append(str);
					if (isCarriageReturn) {
						buffer.append("\n");
					}
				}
			}
		} finally {
			close(bReader, method);
		}

		return buffer.toString();
	}

	public static String requestAndresponseAddCookie(HttpServletRequest req, String endPoint, int conTimeOut, int soTimeOut, String encode) throws IOException {
		StringBuffer buffer = new StringBuffer();
		BufferedReader bReader = null;
		HttpClient httpClient = new HttpClient();

		HttpState initialState = new HttpState();
		javax.servlet.http.Cookie[] cos = req.getCookies();
		
		if(cos != null){
		
			Cookie[] cookieArray = new Cookie[cos.length];
	
			for (int i = 0; i < cos.length; i++) {
				cookieArray[i] = (new Cookie(".daum.net", cos[i].getName(), cos[i].getValue(), "/", null, false));
			}
			initialState.addCookies(cookieArray);
		
		}
		httpClient.setState(initialState);

		GetMethod method = new GetMethod(endPoint);
		try {
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeOut);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(soTimeOut);
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(1, false));
			int statusCode = httpClient.executeMethod(method);

			if (statusCode == HttpStatus.SC_OK) {
				bReader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encode));

				String str;
				while ((str = bReader.readLine()) != null) {
					buffer.append(str);

				}
			}
		} finally {
			if (bReader != null) {
				try {
					bReader.close();
				} catch (Exception e) {
					log.error(e.toString());
				}
			}
			method.releaseConnection();
		}

		return buffer.toString();
	}

	public static String getUrlStringForUccSearch(String endPoint, int conTimeOut, int soTimeOut) throws IOException {
		StringBuffer buffer = new StringBuffer();
		BufferedReader bReader = null;
		HttpClient httpClient = new HttpClient();
		httpClient.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
		HttpMethod method = new GetMethod(endPoint);
		try {
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeOut);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(soTimeOut);
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(1, false));
			int statusCode = httpClient.executeMethod(method);

			if (statusCode == HttpStatus.SC_OK) {
				bReader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), "UTF-8"));
				String str;
				while ((str = bReader.readLine()) != null) {
					buffer.append(str.replaceAll("UTF-8", "EUC-KR"));
				}
			}
		} finally {
			close(bReader, method);
		}

		return buffer.toString();
	}

	public static String postRequestAndresponseByParam(String endPoint, int conTimeOut, int soTimeOut, String encode, Map<String, String> param) throws IOException {
		StringBuffer buffer = new StringBuffer();
		BufferedReader bReader = null;
		HttpClient httpClient = new HttpClient();
		httpClient.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
		PostMethod method = new PostMethod(endPoint);

		List<Part> partList = new ArrayList<Part>();
		StringBuffer bedugurl = new StringBuffer(endPoint);

		if (param != null) {
			for (Entry<String, String> entry : param.entrySet()) {
				partList.add(new StringPart(entry.getKey(), entry.getValue(), encode));
				bedugurl.append("&").append(entry.getKey()).append("=").append(param.get(entry.getValue()));
			}
		}
		// System.out.println(bedugurl.toString());

		method.setRequestEntity(new MultipartRequestEntity(partList.toArray(new Part[partList.size()]), method.getParams()));

		try {
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeOut);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(soTimeOut);
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3, false));
			int statusCode = httpClient.executeMethod(method);

			if (statusCode == HttpStatus.SC_OK) {
				bReader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encode));

				String str;
				while ((str = bReader.readLine()) != null) {
					buffer.append(str).append("\n");
				}
			}
		} finally {
			close(bReader, method);
		}

		return buffer.toString();

	}
	
	public static String getRequestAndresponseByParam(String endPoint, String encode, Map<String, String> param) throws IOException {
		return getRequestAndresponseByParam(endPoint, defaultConnetionTimeout, defaultSocketTimeout, encode, param);
	}
	
	public static String getRequestAndresponseByParam(String endPoint, int conTimeOut, int soTimeOut, String encode, Map<String, String> param) throws IOException {
		StringBuffer buffer = new StringBuffer();
		BufferedReader bReader = null;
		HttpClient httpClient = new HttpClient();
		httpClient.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
		GetMethod method = new GetMethod(endPoint);

		List<Part> partList = new ArrayList<Part>();
		StringBuffer bedugurl = new StringBuffer();
		
		
		//System.out.println("param========"+param);
		if (param != null) {
			int seq = 0;
			for (Entry<String, String> entry : param.entrySet()) {
				partList.add(new StringPart(entry.getKey(), entry.getValue(), encode));
				
				//System.out.println("1243============="+param.get(entry.getValue())+"======"+entry.getValue());
				if(seq == 0){
					bedugurl.append(entry.getKey()).append("=").append(entry.getValue());
				}else{
					bedugurl.append("&").append(entry.getKey()).append("=").append(entry.getValue());
				}
				
				seq ++;
			}
		}
		
//		System.out.println("queryString=========="+bedugurl.toString());

		method.setQueryString(bedugurl.toString());

		try {
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeOut);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(soTimeOut);
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3, false));
			
//			System.out.println("method======="+method.getParams());
			int statusCode = httpClient.executeMethod(method);

			if (statusCode == HttpStatus.SC_OK) {
				bReader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encode));

				String str;
				while ((str = bReader.readLine()) != null) {
					buffer.append(str).append("\n");
					
//					System.out.println("str======="+str);
				}
			}
		} finally {
			close(bReader, method);
		}

		return buffer.toString();
	}
	
	

	public static String postRequestAndresponse(String endPoint, int conTimeOut, int soTimeOut, String encode, String content) throws IOException {
		StringBuffer buffer = new StringBuffer();
		BufferedReader bReader = null;
		HttpClient httpClient = new HttpClient();
		httpClient.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
		PostMethod method = new PostMethod(endPoint);
		RequestEntity requestEntity = new StringRequestEntity(content, "text/html", encode);
		method.setRequestEntity(requestEntity);

		try {
			httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(conTimeOut);
			httpClient.getHttpConnectionManager().getParams().setSoTimeout(soTimeOut);
			method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(3, false));
			int statusCode = httpClient.executeMethod(method);

			if (statusCode == HttpStatus.SC_OK) {
				bReader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), encode));

				String str;
				while ((str = bReader.readLine()) != null) {
					buffer.append(str).append("\n");
				}
			}
		} finally {
			if (bReader != null) {
				try {
					bReader.close();
				} catch (Exception e) {
					log.error(e.toString());
				}
			}
			method.releaseConnection();
		}

		return buffer.toString();
	}

	@SuppressWarnings("deprecation")
	public static boolean killThreadByName(String name) {
		if (name != null) {
			//
			// get top ThreadGroup
			//
			ThreadGroup masterGroup = Thread.currentThread().getThreadGroup();
			while (masterGroup.getParent() != null) {
				masterGroup = masterGroup.getParent();
			}

			Thread threads[] = new Thread[masterGroup.activeCount()];
			int numThreads = masterGroup.enumerate(threads);
			int loopCount = 0;
			for (int i = 0; i < numThreads; i++) {
				// System.out.println(name+"\t"+threads[i]);

				if (threads[i] != null && name.equals(threads[i].getName())) {
					while (threads[i].isAlive() && loopCount < 5) {
						loopCount++;
						threads[i].stop();
						log.info("try : {}, kill thread {}", loopCount, name);
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.fillInStackTrace();
						}
					}
					if (loopCount >= 5) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private static void close(BufferedReader bReader, HttpMethod method) {
		if (bReader != null) {
			try {
				bReader.close();
			} catch (IOException e) {
				log.error(e.toString());
			}
		}
		method.releaseConnection();
	}
	

	public static void main(String[] args) {
		try {
			// String aaa =
			// requestAndresponse("http://test.daum.net/1.0/search.daum?price_compare=1&mltype=1&categoryid=DK&lastyn=0&page_no=1&page_size=25&notsearchbcateid=A%7CB%7CC%7CU&best100_view=1&wish_view=1&viewflag=category|brand|maker|shoppingmall|price|hit|soho|best100|wish|prodlist|prodtype");
			String aaa = requestAndresponse("http://profile.daum.net/api/v1_0/WriteToShare.daum?by=xml&daum_user_id=1n3Kf&message=123&daum_id=kwon977");
			log.info(aaa);
		} catch (Exception e) {
			log.error(e.toString());
		}
	}

}
