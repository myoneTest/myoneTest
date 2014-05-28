package net.daum.myone.frontapi.mvc.entity;

import java.util.List;



public class Comp {
	private String compid;					//제휴사ID
	private String compnm;					//제휴사명
	private String biznm;					//회사명
	private String sttscd;					//1:서비스중, 2:서비스해지
	private String cardmemberreship;		//구마이원 : 11(전환해야하는거), 1N, NN
	private String brandyn;					//브랜드여부
	private String catecd;					//메인카테고리코드
	private String complogourl;				//제휴사로고이미지
	private String pointpolicy;				//포인트정책
	private String biztelnoar;				
	private String biztelno;
	private String postno;
	private String postaddr;
	private String postaddrdtl;
	private String hmpageaddr;
	private String etcbenefit;				//기타정보
	private String compdscrp;
	private String compbenefit1;
	private String compbenefit2;
	private String compbenefit3;
	private String compbenefit4;
	private String linedesc;				//제휴사 한줄 소개
	private String simpledesc;				//제휴사 간략정보
	private String benefit;					//제휴사 혜택정보
	private String benefitdetail;			//제휴사 혜택정보 상세
	private String memberuseinfo;			//제휴사 사용정보
	private String membertransinfo;			//제휴사 이관정보
	private String memberexpireinfo;		//제휴사 소멸정보
	private String compcontacturl;			//매장정보
	private String compbenefiturl;			//멤버십 혜택 url
	private String regtype;
	private String compguide;  //제휴사 가이드 (2차 업데이트 추가됨)
	private String viewtype;		//뷰타입 (M : MS , B : bacode)
	private String barcodeyn;		//바코드 발행 여부
	private String prefbranchyn;	//선호매장 선택 여부
	private String engnameyn;		//영문명 입력여부
	private String addryn;			//주소입력여부
	private String smsyn;			//sms수신동의여부
	private String emailyn;			//email 수신동의여부
	private String tmyn;			//tm 수신동의여부
	private String dmyn;			//dm 수신동의여부
	private String mflag;
	private String setupdttm;		
	private String closetype;		//1:마이원해지, 2:제휴사해지
	private String responsetype;
	private String searchpointtype;
	private String myoneiduseyn;
	private String mshipseq;		//멤버십번호
	private String myoneid;			//마이원ID
	private long blncmilg;			//잔여포인트
	private String formatblncmilg;	//잔여포인트(콤마 넣은것)
	private String membershipsttscd;	//멤버십 상태 - 0(등록대기), 1(등록), 8(해지대기), 9(해지)
	private String connectyn;	//연결여부
	private String lstdealdttm;	//최종거래일시
	private String recommendyn;	//추천여부
	private String eventname;	//이벤트명
	private String couponnm;	//쿠폰명
	private String failcompyn;	//일괄연결 실패
	private Event event;		//이벤트
	private List<CompBrand> compbrandlist;	//제휴사 브랜드 리스트		
	private String reservetip;
	private String usetip;
	
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	public String getCompnm() {
		return compnm;
	}
	public void setCompnm(String compnm) {
		this.compnm = compnm;
	}
	public String getBiznm() {
		return biznm;
	}
	public void setBiznm(String biznm) {
		this.biznm = biznm;
	}
	public String getSttscd() {
		return sttscd;
	}
	public void setSttscd(String sttscd) {
		this.sttscd = sttscd;
	}
	public String getCardmemberreship() {
		return cardmemberreship;
	}
	public void setCardmemberreship(String cardmemberreship) {
		this.cardmemberreship = cardmemberreship;
	}
	public String getBrandyn() {
		return brandyn;
	}
	public void setBrandyn(String brandyn) {
		this.brandyn = brandyn;
	}
	public String getCatecd() {
		return catecd;
	}
	public void setCatecd(String catecd) {
		this.catecd = catecd;
	}
	public String getComplogourl() {
		return complogourl;
	}
	public void setComplogourl(String complogourl) {
		this.complogourl = complogourl;
	}
	public String getPointpolicy() {
		return pointpolicy;
	}
	public void setPointpolicy(String pointpolicy) {
		this.pointpolicy = pointpolicy;
	}
	public String getBiztelnoar() {
		return biztelnoar;
	}
	public void setBiztelnoar(String biztelnoar) {
		this.biztelnoar = biztelnoar;
	}
	public String getBiztelno() {
		return biztelno;
	}
	public void setBiztelno(String biztelno) {
		this.biztelno = biztelno;
	}
	public String getPostno() {
		return postno;
	}
	public void setPostno(String postno) {
		this.postno = postno;
	}
	public String getPostaddr() {
		return postaddr;
	}
	public void setPostaddr(String postaddr) {
		this.postaddr = postaddr;
	}
	public String getPostaddrdtl() {
		return postaddrdtl;
	}
	public void setPostaddrdtl(String postaddrdtl) {
		this.postaddrdtl = postaddrdtl;
	}
	public String getHmpageaddr() {
		return hmpageaddr;
	}
	public void setHmpageaddr(String hmpageaddr) {
		this.hmpageaddr = hmpageaddr;
	}
	public String getEtcbenefit() {
		return etcbenefit;
	}
	public void setEtcbenefit(String etcbenefit) {
		this.etcbenefit = etcbenefit;
	}
	public String getCompdscrp() {
		return compdscrp;
	}
	public void setCompdscrp(String compdscrp) {
		this.compdscrp = compdscrp;
	}
	public String getCompbenefit1() {
		return compbenefit1;
	}
	public void setCompbenefit1(String compbenefit1) {
		this.compbenefit1 = compbenefit1;
	}
	public String getCompbenefit2() {
		return compbenefit2;
	}
	public void setCompbenefit2(String compbenefit2) {
		this.compbenefit2 = compbenefit2;
	}
	public String getCompbenefit3() {
		return compbenefit3;
	}
	public void setCompbenefit3(String compbenefit3) {
		this.compbenefit3 = compbenefit3;
	}
	public String getCompbenefit4() {
		return compbenefit4;
	}
	public void setCompbenefit4(String compbenefit4) {
		this.compbenefit4 = compbenefit4;
	}
	public String getLinedesc() {
		return linedesc;
	}
	public void setLinedesc(String linedesc) {
		this.linedesc = linedesc;
	}
	public String getSimpledesc() {
		return simpledesc;
	}
	public void setSimpledesc(String simpledesc) {
		this.simpledesc = simpledesc;
	}
	public String getBenefit() {
		return benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}
	public String getBenefitdetail() {
		return benefitdetail;
	}
	public void setBenefitdetail(String benefitdetail) {
		this.benefitdetail = benefitdetail;
	}
	public String getMemberuseinfo() {
		return memberuseinfo;
	}
	public void setMemberuseinfo(String memberuseinfo) {
		this.memberuseinfo = memberuseinfo;
	}
	public String getMembertransinfo() {
		return membertransinfo;
	}
	public void setMembertransinfo(String membertransinfo) {
		this.membertransinfo = membertransinfo;
	}
	public String getMemberexpireinfo() {
		return memberexpireinfo;
	}
	public void setMemberexpireinfo(String memberexpireinfo) {
		this.memberexpireinfo = memberexpireinfo;
	}
	public String getCompcontacturl() {
		return compcontacturl;
	}
	public void setCompcontacturl(String compcontacturl) {
		this.compcontacturl = compcontacturl;
	}
	public String getCompbenefiturl() {
		return compbenefiturl;
	}
	public void setCompbenefiturl(String compbenefiturl) {
		this.compbenefiturl = compbenefiturl;
	}
	public String getRegtype() {
		return regtype;
	}
	public void setRegtype(String regtype) {
		this.regtype = regtype;
	}
	public String getCompguide() {
		return compguide;
	}
	public void setCompguide(String compguide) {
		this.compguide = compguide;
	}
	public String getViewtype() {
		return viewtype;
	}
	public void setViewtype(String viewtype) {
		this.viewtype = viewtype;
	}
	public String getBarcodeyn() {
		return barcodeyn;
	}
	public void setBarcodeyn(String barcodeyn) {
		this.barcodeyn = barcodeyn;
	}
	public String getPrefbranchyn() {
		return prefbranchyn;
	}
	public void setPrefbranchyn(String prefbranchyn) {
		this.prefbranchyn = prefbranchyn;
	}
	public String getEngnameyn() {
		return engnameyn;
	}
	public void setEngnameyn(String engnameyn) {
		this.engnameyn = engnameyn;
	}
	public String getAddryn() {
		return addryn;
	}
	public void setAddryn(String addryn) {
		this.addryn = addryn;
	}
	public String getSmsyn() {
		return smsyn;
	}
	public void setSmsyn(String smsyn) {
		this.smsyn = smsyn;
	}
	public String getEmailyn() {
		return emailyn;
	}
	public void setEmailyn(String emailyn) {
		this.emailyn = emailyn;
	}
	public String getTmyn() {
		return tmyn;
	}
	public void setTmyn(String tmyn) {
		this.tmyn = tmyn;
	}
	public String getDmyn() {
		return dmyn;
	}
	public void setDmyn(String dmyn) {
		this.dmyn = dmyn;
	}
	public String getMflag() {
		return mflag;
	}
	public void setMflag(String mflag) {
		this.mflag = mflag;
	}
	public String getSetupdttm() {
		return setupdttm;
	}
	public void setSetupdttm(String setupdttm) {
		this.setupdttm = setupdttm;
	}
	public String getClosetype() {
		return closetype;
	}
	public void setClosetype(String closetype) {
		this.closetype = closetype;
	}
	public String getResponsetype() {
		return responsetype;
	}
	public void setResponsetype(String responsetype) {
		this.responsetype = responsetype;
	}
	public String getSearchpointtype() {
		return searchpointtype;
	}
	public void setSearchpointtype(String searchpointtype) {
		this.searchpointtype = searchpointtype;
	}
	public String getMyoneiduseyn() {
		return myoneiduseyn;
	}
	public void setMyoneiduseyn(String myoneiduseyn) {
		this.myoneiduseyn = myoneiduseyn;
	}
	public String getMshipseq() {
		return mshipseq;
	}
	public void setMshipseq(String mshipseq) {
		this.mshipseq = mshipseq;
	}
	public String getMyoneid() {
		return myoneid;
	}
	public void setMyoneid(String myoneid) {
		this.myoneid = myoneid;
	}
	public long getBlncmilg() {
		return blncmilg;
	}
	public void setBlncmilg(long blncmilg) {
		this.blncmilg = blncmilg;
	}
	public String getFormatblncmilg() {
		return formatblncmilg;
	}
	public void setFormatblncmilg(String formatblncmilg) {
		this.formatblncmilg = formatblncmilg;
	}
	public String getMembershipsttscd() {
		return membershipsttscd;
	}
	public void setMembershipsttscd(String membershipsttscd) {
		this.membershipsttscd = membershipsttscd;
	}
	public String getConnectyn() {
		return connectyn;
	}
	public void setConnectyn(String connectyn) {
		this.connectyn = connectyn;
	}
	public String getLstdealdttm() {
		return lstdealdttm;
	}
	public void setLstdealdttm(String lstdealdttm) {
		this.lstdealdttm = lstdealdttm;
	}
	public String getRecommendyn() {
		return recommendyn;
	}
	public void setRecommendyn(String recommendyn) {
		this.recommendyn = recommendyn;
	}
	public String getEventname() {
		return eventname;
	}
	public void setEventname(String eventname) {
		this.eventname = eventname;
	}
	public String getCouponnm() {
		return couponnm;
	}
	public void setCouponnm(String couponnm) {
		this.couponnm = couponnm;
	}
	public String getFailcompyn() {
		return failcompyn;
	}
	public void setFailcompyn(String failcompyn) {
		this.failcompyn = failcompyn;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public List<CompBrand> getCompbrandlist() {
		return compbrandlist;
	}
	public void setCompbrandlist(List<CompBrand> compbrandlist) {
		this.compbrandlist = compbrandlist;
	}
	public String getReservetip() {
		return reservetip;
	}
	public void setReservetip(String reservetip) {
		this.reservetip = reservetip;
	}
	public String getUsetip() {
		return usetip;
	}
	public void setUsetip(String usetip) {
		this.usetip = usetip;
	}
}
