package net.daum.myone.frontapi.mvc.entity;

import java.util.List;

public class MyoneCard {

	private String myoneid;				//마이원ID
	private String oldmyoneid;			
	private String cardgodsid;
	private String crdtno;				//신용카드번호
	private String regtype;				//등록타입(A:선등록, B:후등록)
	private String issurtypecd;		
	private String cardbinchk;			
	private String sttscd;				//상태(1:등록, 2:해지)
	private String issudt;				//발급년월일
	private String clselostdt;			//해지/분실년월일
	private String cardid;				//카드사ID
	private String cardnm;				//카드사명
	private String imgurl;				
	private String formatcrdtno;		//포맷된 카드번호
	private int membershipcount;		//가입멤버십 갯수
	private String lstdealdttm;			//+ 멤버십 마지막 거래 일시 일시
	private String dummyflag;
	private String selectflag;			//선택된 마이원카드인지 여부
	private String cardinfourl;			//카드 혜택페이지 url
	private String delyn;				//카드 삭제 가능여부
	private String cardinfotype;		//카드 타입
	
	private List<Comp> complist;		//제휴사 리스트	
	private MemberShip membership;		//멤버십 가입 정보
	private List<Banner> bannerlist;	//배너(카드사 광고영역)리스트 
	
	public String getMyoneid() {
		return myoneid;
	}
	public void setMyoneid(String myoneid) {
		this.myoneid = myoneid;
	}
	public String getOldmyoneid() {
		return oldmyoneid;
	}
	public void setOldmyoneid(String oldmyoneid) {
		this.oldmyoneid = oldmyoneid;
	}
	public String getCardgodsid() {
		return cardgodsid;
	}
	public void setCardgodsid(String cardgodsid) {
		this.cardgodsid = cardgodsid;
	}
	public String getCrdtno() {
		return crdtno;
	}
	public void setCrdtno(String crdtno) {
		this.crdtno = crdtno;
	}
	public String getRegtype() {
		return regtype;
	}
	public void setRegtype(String regtype) {
		this.regtype = regtype;
	}
	public String getIssurtypecd() {
		return issurtypecd;
	}
	public void setIssurtypecd(String issurtypecd) {
		this.issurtypecd = issurtypecd;
	}
	public String getCardbinchk() {
		return cardbinchk;
	}
	public void setCardbinchk(String cardbinchk) {
		this.cardbinchk = cardbinchk;
	}
	public String getSttscd() {
		return sttscd;
	}
	public void setSttscd(String sttscd) {
		this.sttscd = sttscd;
	}
	public String getIssudt() {
		return issudt;
	}
	public void setIssudt(String issudt) {
		this.issudt = issudt;
	}
	public String getClselostdt() {
		return clselostdt;
	}
	public void setClselostdt(String clselostdt) {
		this.clselostdt = clselostdt;
	}
	public String getCardid() {
		return cardid;
	}
	public void setCardid(String cardid) {
		this.cardid = cardid;
	}
	public String getCardnm() {
		return cardnm;
	}
	public void setCardnm(String cardnm) {
		this.cardnm = cardnm;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getFormatcrdtno() {
		return formatcrdtno;
	}
	public void setFormatcrdtno(String formatcrdtno) {
		this.formatcrdtno = formatcrdtno;
	}
	public int getMembershipcount() {
		return membershipcount;
	}
	public void setMembershipcount(int membershipcount) {
		this.membershipcount = membershipcount;
	}
	public String getLstdealdttm() {
		return lstdealdttm;
	}
	public void setLstdealdttm(String lstdealdttm) {
		this.lstdealdttm = lstdealdttm;
	}
	public String getDummyflag() {
		return dummyflag;
	}
	public void setDummyflag(String dummyflag) {
		this.dummyflag = dummyflag;
	}
	public String getSelectflag() {
		return selectflag;
	}
	public void setSelectflag(String selectflag) {
		this.selectflag = selectflag;
	}
	public String getCardinfourl() {
		return cardinfourl;
	}
	public void setCardinfourl(String cardinfourl) {
		this.cardinfourl = cardinfourl;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	public String getCardinfotype() {
		return cardinfotype;
	}
	public void setCardinfotype(String cardinfotype) {
		this.cardinfotype = cardinfotype;
	}
	public List<Comp> getComplist() {
		return complist;
	}
	public void setComplist(List<Comp> complist) {
		this.complist = complist;
	}
	public MemberShip getMembership() {
		return membership;
	}
	public void setMembership(MemberShip membership) {
		this.membership = membership;
	}
	public List<Banner> getBannerlist() {
		return bannerlist;
	}
	public void setBannerlist(List<Banner> bannerlist) {
		this.bannerlist = bannerlist;
	}
	
	
}
