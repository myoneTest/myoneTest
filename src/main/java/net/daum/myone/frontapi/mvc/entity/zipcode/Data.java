package net.daum.myone.frontapi.mvc.entity.zipcode;

import java.util.HashMap;
import java.util.Map;

import net.daum.myone.frontapi.util.StringUtil;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("data")
public class Data {
	
	private String ZIPCODE;
	private String NAME1;
	private String NAME2;
	private String NAME3;
	private String NAME4;
	private String NAME_ISLAND;
	private String MTYN;
	private String STMASN;
	private String STSBSN;
	private String ENMASN;
	private String ENSBSN;
	private String APTBDNM;
	private String STDONG;
	private String ENDONG;
	
	public Address convertToAddress() {
		Map<String, String> regionmap = new HashMap<String, String>();
		regionmap.put("서울특별시", "서울");
		regionmap.put("경기도", "경기");
		regionmap.put("충청북도", "충북");
		regionmap.put("충청남도", "충남");
		regionmap.put("경상북도", "경북");
		regionmap.put("경상남도", "경남");
		regionmap.put("전라북도", "전북");
		regionmap.put("전라남도", "전남");
		regionmap.put("인천광역시", "인천");
		regionmap.put("대전광역시", "대전");
		regionmap.put("대구광역시", "대구");
		regionmap.put("울산광역시", "울산");
		regionmap.put("부산광역시", "부산");
		regionmap.put("광주광역시", "광주");
		regionmap.put("제주특별자치도", "제주");
		regionmap.put("세종특별자치시", "세종");
		regionmap.put("강원도", "강원");
		
		Address address = new Address();
		address.setZipcode(this.ZIPCODE);
		address.setRegion(regionmap.get(this.NAME1));
		address.setName1(this.NAME1);
		address.setName2(this.NAME2);
		address.setName3(this.NAME3);
		address.setName4(this.NAME4);
		address.setNameisland(this.NAME_ISLAND);
		address.setMtyn(this.MTYN);
		address.setStmasn(this.STMASN);
		address.setStsbsn(this.STSBSN);
		address.setEnmasn(this.ENMASN);
		address.setEnsbsn(this.ENSBSN);
		address.setAptbdnm(this.APTBDNM);
		address.setStdong(this.STDONG);
		address.setEndong(this.ENDONG);
		
		if(StringUtil.isEmpty(address.getRegion())){
			address.setRegion(" ");
		}
		if(StringUtil.isEmpty(address.getName1())){
			address.setName1(" ");
		}
		if(StringUtil.isEmpty(address.getName2())){
			address.setName2(" ");
		}
		if(StringUtil.isEmpty(address.getName3())){
			address.setName3(" ");
		}
		if(StringUtil.isEmpty(address.getName4())){
			address.setName4(" ");
		}
		
		
		return address;
	}
	
	public String getNAME1() {
		return NAME1;
	}
	public String getNAME2() {
		return NAME2;
	}
	public String getNAME3() {
		return NAME3;
	}
	public String getNAME4() {
		return NAME4;
	}
	public String getNAME_ISLAND() {
		return NAME_ISLAND;
	}
	public String getMTYN() {
		return MTYN;
	}
	public String getSTMASN() {
		return STMASN;
	}
	public String getSTSBSN() {
		return STSBSN;
	}
	public String getENMASN() {
		return ENMASN;
	}
	public String getENSBSN() {
		return ENSBSN;
	}
	public String getAPTBDNM() {
		return APTBDNM;
	}
	public String getSTDONG() {
		return STDONG;
	}
	public String getENDONG() {
		return ENDONG;
	}
	
	public void setNAME1(String nAME1) {
		NAME1 = nAME1;
	}
	public void setNAME2(String nAME2) {
		NAME2 = nAME2;
	}
	public void setNAME3(String nAME3) {
		NAME3 = nAME3;
	}
	public void setNAME4(String nAME4) {
		NAME4 = nAME4;
	}
	public void setNAME_ISLAND(String nAME_ISLAND) {
		NAME_ISLAND = nAME_ISLAND;
	}
	public void setMTYN(String mTYN) {
		MTYN = mTYN;
	}
	public void setSTMASN(String sTMASN) {
		STMASN = sTMASN;
	}
	public void setSTSBSN(String sTSBSN) {
		STSBSN = sTSBSN;
	}
	public void setENMASN(String eNMASN) {
		ENMASN = eNMASN;
	}
	public void setENSBSN(String eNSBSN) {
		ENSBSN = eNSBSN;
	}
	public void setAPTBDNM(String aPTBDNM) {
		APTBDNM = aPTBDNM;
	}
	public void setSTDONG(String sTDONG) {
		STDONG = sTDONG;
	}
	public void setENDONG(String eNDONG) {
		ENDONG = eNDONG;
	}
	public String getZIPCODE() {
		return ZIPCODE;
	}
	public void setZIPCODE(String zIPCODE) {
		ZIPCODE = zIPCODE;
	}
	
	
	
}
