package net.daum.myone.frontapi.mvc.entity;


public class ContSetValue extends FrontBaseEntity {
	private String setseq;			//셋시퀀스
	private int valuenum;			//번호
	private String compid;			//제휴사ID
	private String issurid;			//발급사ID
	private String eventid;			//이벤트ID
	private String noticeid;		//공지ID
	private String couponseq;		//쿠폰시퀀스
	private String cateid;			//카테ID
	private String text;			//텍스트
	private String imgurl;			//이미지
	private String linkurl;			//링크
	private String htmltext;		//롱텍스트
	private String code;		//코드
	private String codecate;	//코드종류
	
	private String imgyn;	//이미지 존재여부
	private String compnm;	//제휴사명
	private String issurnm;	//발급사명
	private String eventsubject;	//이벤트제목
	private String noticesubject;	//공지제목
	private String catename;		//카테명
		
	private Comp comp;		//제휴사
	private Event event;	//이벤트
	private Notice notice;	//공지
	private Coupon coupon;	//쿠폰
	public String getSetseq() {
		return setseq;
	}
	public void setSetseq(String setseq) {
		this.setseq = setseq;
	}
	public int getValuenum() {
		return valuenum;
	}
	public void setValuenum(int valuenum) {
		this.valuenum = valuenum;
	}
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	public String getIssurid() {
		return issurid;
	}
	public void setIssurid(String issurid) {
		this.issurid = issurid;
	}
	public String getEventid() {
		return eventid;
	}
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	public String getNoticeid() {
		return noticeid;
	}
	public void setNoticeid(String noticeid) {
		this.noticeid = noticeid;
	}
	public String getCouponseq() {
		return couponseq;
	}
	public void setCouponseq(String couponseq) {
		this.couponseq = couponseq;
	}
	public String getCateid() {
		return cateid;
	}
	public void setCateid(String cateid) {
		this.cateid = cateid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getLinkurl() {
		return linkurl;
	}
	public void setLinkurl(String linkurl) {
		this.linkurl = linkurl;
	}
	public String getHtmltext() {
		return htmltext;
	}
	public void setHtmltext(String htmltext) {
		this.htmltext = htmltext;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodecate() {
		return codecate;
	}
	public void setCodecate(String codecate) {
		this.codecate = codecate;
	}
	public String getImgyn() {
		return imgyn;
	}
	public void setImgyn(String imgyn) {
		this.imgyn = imgyn;
	}
	public String getCompnm() {
		return compnm;
	}
	public void setCompnm(String compnm) {
		this.compnm = compnm;
	}
	public String getIssurnm() {
		return issurnm;
	}
	public void setIssurnm(String issurnm) {
		this.issurnm = issurnm;
	}
	public String getEventsubject() {
		return eventsubject;
	}
	public void setEventsubject(String eventsubject) {
		this.eventsubject = eventsubject;
	}
	public String getNoticesubject() {
		return noticesubject;
	}
	public void setNoticesubject(String noticesubject) {
		this.noticesubject = noticesubject;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	public Comp getComp() {
		return comp;
	}
	public void setComp(Comp comp) {
		this.comp = comp;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
	}
	public Coupon getCoupon() {
		return coupon;
	}
	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
	
}
