/*
 * @(#) $Id: $
 *
 * @file StringUtil.java
 * Copyright by Daum Communications Corp.
 * @date 2006. 4. 27
 */
package net.daum.myone.frontapi.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;


public class StringUtil {

	public static final int EMPTY_INT = 0;
	public static final long EMPTY_LONG = 0;
	public static final long EMPTY_FLOAT = 0;
	public static final String EMPTY_STRING = "";

	/**
	 * 입력받은 문자열이 null 이면 빈 문자열을 리턴한다.
	 * null 이 아니라면 입력받은 문자열을 다시 리턴한다.
	 */
	public static String checkNull(String str) {
		return StringUtil.checkNull(str, EMPTY_STRING);
	}

	public static String checkEmpty(String str) {
		return StringUtil.checkEmpty(str, EMPTY_STRING);
	}

	/**
	 * 입력받은 문자열이 null 이면 파라미터로 넘긴 기본값을 리턴한다.
	 * null 이 아니라면 입력받은 문자열을 다시 리턴한다. 
	 */
	public static String checkNull(String str, String defaultString) {
		if (str == null || EMPTY_STRING.equals(str)) {
			return defaultString;
		}
		return str;
	}

	public static String checkEmpty(String str, String defaultString) {
		if (str == null || "".equals(str)) {
			return defaultString;
		}
		return str.trim();
	}

	public static int checkInt(String str) {
		return checkInt(str, EMPTY_INT);
	}

	public static int checkInt(String str, int defaultInt) {
		if (str == null) {
			return defaultInt;
		}
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return defaultInt;
		}
	}

	public static String makeDateFormat(String str){
		if(str == null || str.length() < 8)
			return str;

		return str.substring(0, 4) + "." + str.substring(4, 6) + "." + str.substring(6, 8);
	}

	public static long checkLong(String str) {
		return checkLong(str, EMPTY_LONG);
	}

	public static long checkLong(String str, long defaultLong) {
		if (str == null) {
			return defaultLong;
		}
		try {
			return Long.parseLong(str);
		} catch (NumberFormatException nfe) {
			return defaultLong;
		}
	}

	public static float checkFloat(String str) {
		return checkFloat(str, EMPTY_FLOAT);
	}

	public static float checkFloat(String str, float defaultFloat) {
		if (str == null) {
			return defaultFloat;
		}
		try {
			return Float.parseFloat(str);
		} catch (NumberFormatException nfe) {
			return defaultFloat;
		}
	}

	/**
	 * 문자열의 byte size를 구한다.
	 */
	public static int getByteSize(String str) {
		if (str == null) return 0;
		int size = 0;
		for (int i = 0; i < str.length(); i++) {
			if (isTwoByteChar(str.charAt(i))) 
				size++;
			size++;
		}        
		return size;
	}

	public static boolean isEmpty(String str) {
		if (str == null) {
			return true;
		}
		if (str.trim().length() == 0) {
			return true;
		}
		return false;
	}

	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}

	public static boolean hasText(String str){
		return !isEmpty(str);
	}

	public static String getDefaultArrayValue(String[] arr, int index) {
		return getDefaultArrayValue(arr, index,"") ;
	}
	public static String getDefaultArrayValue(String[] arr, int index,String defaultVal) {
		if ( arr != null && arr.length >= index+1) {
			return arr[index];
		} else {
			return defaultVal;
		}
	}

	public static boolean isTwoByteChar(char c) {
		return (c > 127);
	}

	public static String build(Object[] objects) {
		StringBuilder builder = new StringBuilder();
		for (Object object : objects) {
			builder.append(object);
		}
		return builder.toString();
	}

	public static String encodeURL(String origin) {
		String result = origin;
		if (origin != null) {

			try {
				result = URLEncoder.encode(origin, "MS949");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				throw new IllegalArgumentException(e);
			}
		}
		return result;
	}

	public static String urlName(String name) throws UnsupportedEncodingException{
		//System.out.println("name="+name);
		if(name==null || name.equals("")){
			return "";
		}
		String[] temp = name.split("\\+");
		StringBuilder retname= new StringBuilder();
		for(int i=0;i<temp.length;i++){
			retname.append(URLDecoder.decode(temp[i], "UTF-8"));
			//System.out.println("\n decode UTF-8 : "+retname);
			if(i+1<temp.length){
				retname.append("+");
			}
		}
		//System.out.println("retname"+retname);
		return retname.toString();
	}

	public static String convertHtmlUnicodeToInternal(String origin) {
		StringBuffer result = new StringBuffer();
		int start = 0;
		int end = -1;
		while ( (end = origin.indexOf("&#", start)) != -1 ) {
			result.append(origin.substring(start, end));
			start = end + 2;
			if ((end = origin.indexOf(';', start)) > 0) {
				char temp = (char)Integer.parseInt(origin.substring(start, end));
				result.append(temp);
				start = end + 1;
			}
		}
		if (start >= 0 && start < origin.length())
			result.append(origin.substring(start));
		return result.toString();
	}

	public static String escapeHtml(String origin) {
		if (origin == null) {
			return null;
		}
		char[] aChar = origin.toCharArray();

		StringBuffer strBuf = new StringBuffer();
		for (int i = 0, ln = aChar.length; i < ln; i++) {
			char c = aChar[i];
			switch (c) {
			case '<':
				strBuf.append("&lt;");
				break;
			case '>':
				strBuf.append("&gt;");
				break;
			case '&':
				if (i < ln + 1 && aChar[i + 1] == '#') {
					strBuf.append('&');
				} else {
					strBuf.append("&amp;");
				}
				break;
			case '"':
				strBuf.append("&quot;");
				break;
			case '\'':
				strBuf.append("&#39;");
				break;
			default:
				strBuf.append(c);
			}
		}
		return strBuf.toString();
	}


	/**
	 * 특정 문자열을 주어진 문자열로 교체한다. 
	 * @param text 원본문자열
	 * @param repl 교체대상문자열
	 * @param with 교체문자열
	 * @return 교체된 문자열
	 */
	public static String replace(String text, String repl, String with){
		return replace(text,repl,with,-1);
	}
	/**
	 * 특정 문자열을 주어진 문자열로 교체한다. 
	 * @param text 원본문자열
	 * @param repl 교체대상문자열
	 * @param with 교체문자열
	 * @param max 교체 횟수 
	 * @return 교체된 문자열
	 */
	public static String replace(String text, String repl, String with, int max){
		if( text == null ) return null;
		StringBuffer buf = new StringBuffer( text.length() );
		int start = 0;
		for(int end = 0; (end = text.indexOf(repl, start)) != -1;){
			buf.append(text.substring(start,end)).append(with);
			start = end +repl.length();
			if(--max == 0) break;
		}
		buf.append(text.substring(start));
		return buf.toString();
	}

	public static String replaceAll(String text, String repl, String replacement) {
		if( text == null ) return null;
		return text.replaceAll(repl, replacement);
	}

	public static String replaceAll(String text, String[] reg, String replacement) {
		if( text == null ) return null;
		String result = text;
		for(int i=0;i<reg.length;i++) {
			result=result.replaceAll(reg[i], "");
		}
		return result;
	}

	public static String replaceSpace(String text){
		return StringUtil.replaceAll(text, new String[]{"\\p{Space}", "\\p{Blank}","\\p{Punct}","\\p{Cntrl}"}, "");
	}

	public static String toStringForComma(int val, int unit){
		String ret="";
		int tempval = val;
		if (tempval>=unit){
			ret = StringUtil.toStringForComma((int)(tempval/unit), unit)+","+String.format("%03d", (tempval%unit));
		}else{
			ret = tempval+"";
		}
		return ret;
	}
	/**
	 * @param startChar
	 * @param endChar
	 * @return startChar 과 endChar 가 포함된 그 사이의 랜덤 문자 
	 */
	public static String getRandomAlphabet(char startChar, char endChar){
		char a = startChar;
		int rValue = (int)(Math.random()*((int)endChar - (int)startChar + 1));
		return String.valueOf(((char)(((int)a)+rValue)));
	}

	public static boolean isNumberStyle(String s) {
		return isNumberStyle(s, 0);
	}

	public static boolean isNumberStyle(String s, int numberType) {
		//numberType(0:number, 1:float)
		String str = null;
		if (s == null || "".equals(str=s.trim())) {
			return false;
		}
		int len = str.length();
		for(int i=0;i<len;i++){
			char ch = str.charAt(i);
			if (i == 1 && numberType == 1) {
				if (!".".equals(String.valueOf(ch)) && !Character.isDigit(ch)) {
					return false;					
				}
			} else {
				if(!Character.isDigit(ch)){
					return false;
				}
			}
		}
		return true;
	}

	public static boolean containSpecChar(String str) {
		for(int i=0;i<str.length();i++) {			
			int c = (int)str.charAt(i);
			if (containSpecChar(c)) {
				return true;
			}
		}
		return false;
	}



	public static boolean containSpecChar(int c) {			
		if((c >=0 && c <=47)
				|| (c>=58 && c<=64)
				|| (c>=91 && c<=96)
				|| (c>=123 && c<=127)) {
			return true;
		}
		return false;
	}


	public static String exceptSpecChar(String str) {			
		return exceptSpecChar(str, null);
	}

	public static String exceptSpecChar(String str, String[] except) {		
		StringBuilder result = new StringBuilder(); 		

		if (str==null) {
			return result.toString();
		}

		for(int i=0;i<str.length();i++) {			
			int c = (int)str.charAt(i);
			boolean exceptflag = true;
			if(except != null) {
				for(int j=0;j<except.length;j++) {
					if(c==except[j].charAt(0)) {
						exceptflag = true;
						break;
					} else {
						exceptflag = false;
					}
				}
			}
			if (exceptflag || !containSpecChar(c)) {
				result.append(str.charAt(i));
			}
		}
		return result.toString().toLowerCase();
	}

	public static String padRight(String str, int n, String padStr) {
		return String.format("%1$-" + n + "s", str).replace(" ", padStr);  
	}

	public static String padLeft(String s, int n, String padStr) {
		return String.format("%1$#" + n + "s", s).replace(" ", padStr);  
	}

	public static String getATagGen(String a) {
		String[] aaaa =a.replace("&gt;", " ").replace("&lt;", " ").replace(">", " ").replace("#", " ").replace("<", " ").replace("..", " ").split(" ");
		List<String> urlString = new ArrayList<String>();

		for (String string : aaaa) {
			if (string.startsWith("http://") ) {
				urlString.add(string);
			}
		}

		for (String string1 : urlString) {
			a= a.replace(string1, "<a href=\""+string1+"\" target=\"blank\">"+string1+"</a>");
		}
		return a;
	}

	public static String removeTag(String text){

		if(isEmpty(text)){
			return "";
		}

		return text.replaceAll("<(/)?([a-zA-Z]*)(\\s[a-zA-Z]*=[^>]*)?(\\s)*(/)?>", "");
	}

	public static String replaceRigth(String orgStr, int offset, char replaceChar) {
		int leng = orgStr.length();

		if (isEmpty(orgStr) || offset < 0) {
			return orgStr;
		}
		if (leng-offset < 0) {
			offset = leng;
		}

		StringBuffer result = new StringBuffer();
		result.append(orgStr.substring(0,leng-offset));

		for (int i = 0; i < offset; i++) {
			result.append(replaceChar);
		}

		return result.toString();

	}

	/**
	 * byte단위로 해당 byte수로 String 잘라서 배열로 리턴
	 * 
	 * @param raw
	 *            : 문자열
	 * @param len
	 *            : byte수
	 * @param encoding
	 *            : euc-kr or UTF-8
	 * @return String[]
	 */
	public static String[] parseStringByBytes(String raw, int len, String encoding) {

		if (raw == null)
			return new String[]{};
		String[] ary = null;
		try {
			// raw 의 byte
			byte[] rawBytes = raw.getBytes(encoding);
			int rawLength = rawBytes.length;
			int index = 0;
			int minus_byte_num = 0;
			int offset = 0;
			int hangul_byte_num = encoding.equals("UTF-8") ? 3 : 2;
			if (rawLength > len) {
				int aryLength = (rawLength / len) + (rawLength % len != 0 ? 1 : 0);
				ary = new String[aryLength];
				for (int i = 0; i < aryLength; i++) {
					minus_byte_num = 0;
					offset = len;
					if (index + offset > rawBytes.length) {
						offset = rawBytes.length - index;
					}

					for (int j = 0; j < offset; j++) {
						if (((int) rawBytes[index + j] & 0x80) != 0) {
							minus_byte_num++;
						}
					}

					if (minus_byte_num % hangul_byte_num != 0) {
						offset -= minus_byte_num % hangul_byte_num;
					}

					ary[i] = new String(rawBytes, index, offset, encoding);
					index += offset;
				}
			} else {
				ary = new String[] { raw };
			}
		} catch (UnsupportedEncodingException e) {
		}
		return ary;

	}

	/**
	 * @param str
	 *            입력문자열
	 * @param length
	 *            자를 길이
	 * @param tailString
	 *            자르고 남는 부분에 붙일 문자열
	 * @return 잘린 문자열
	 */
	public static String cutStringRealLength(String str, int cut_length, String tailString) {

		// null pointer exception 나서 처리
		if (str == null || str.equals("")) {
			return "";
		} else if (str.length() * 2 < cut_length) {
			return str;
		}
		int width[][] = { { 0, 12, 4, 4, 4, 6, 6, 10, 8, 4, 5, 5, 6, 6, 4, 6,
			4, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 4, 4, 8, 6, 8, 6, 12, 8, 8,
			9, 8, 8, 7, 9, 8, 3, 6, 8, 7, 11, 9, 9, 8, 9, 8, 8, 8, 8, 8,
			10, 8, 8, 8, 6, 11, 6, 6, 6, 4, 7, 7, 7, 7, 7, 3, 7, 7, 3, 3,
			6, 3, 11, 7, 7, 7, 7, 4, 7, 3, 7, 6, 10, 7, 7, 7, 6, 6, 6, 9, 0 } };

		if (tailString == null)
			tailString = "";
		StringBuffer str_buffer = new StringBuffer();
		int len_buffer = 0;
		int count = 0;

		int len = str.length();

		int cut_size = width[0][1] * cut_length / 2;

		while (count < len) {

			int asc = (int) str.charAt(count);

			if (asc < 128 && asc > 29) { // asc가 30보다 작은 경우가 생겨 배열에 문제가 생겨 삽입
				len_buffer += width[0][asc - 30];

				if (len_buffer > cut_size) {
					str_buffer.append(tailString);
					break;
				}

				str_buffer.append(str.substring(count, count + 1));
				count += 1;
			} else {
				len_buffer += width[0][1];

				if (len_buffer > cut_size) {
					str_buffer.append(tailString);
					break;
				}
				str_buffer.append(str.substring(count, count + 1));
				count += 1;
			}
		}
		return str_buffer.toString();
	}

	public static String booleanToString(boolean flag){
		if(flag)
			return "Y";
		else
			return "N";
	}

	public static String getNumberEscZero(String str) {
		String newStr = "0";
		char[] ch = str.toCharArray();

		// 문자 하나를 하나를 검사해서 맨 처음 "0"이 아닌 곳에서부터 끝까지 잘라서
		// 새로운 문자열을 리턴한다.
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != '0') {
				newStr = str.substring(i, str.length());
				break;
			}
		}

		return newStr;
	}
	
	public static String makeDatetimeFormat(String str){
		if(str == null || str.length() < 14)
			return str;

		return str.substring(0, 4) + "." + str.substring(4, 6) + "." + str.substring(6, 8) +" " +str.substring(8,10)+":"+str.substring(10, 12);
	}
	
	public static void main(String[] args) {
		//		getParameterClass(new Babo(),null);
		//		String a="SCH-W320?ddd";
		//		
		//		//System.out.println(exceptSpecChar(a));
		//		System.out.println(exceptSpecChar(a, new String[]{"+", "&"}));
		
		String abc = "";
		
		System.out.println(getNumberEscZero(abc));

	}

}
