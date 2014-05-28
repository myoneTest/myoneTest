package net.daum.myone.frontapi.mvc.entity;


public class Coupon extends FrontBaseEntity {
	private String couponseq;		//쿠폰시퀀스
	private String compid;			//제휴사id
	private String issurid;			//카드사id
	private String couponnm;		//쿠폰명
	private String coupontype;		//쿠폰타입(바코드-1, 인증번호-2, 이미지-3)
	private String usebgndttm;		//유효시작일시
	private String useenddttm;		//유효종료일시
	private String bgndttm;			//노출시작일시
	private String enddttm;			//노출종료일시
	private String discountdesc;	//할인혜택
	private String useplace;		//사용처
	private String description;		//상세설명
	private String imgurl;			//이미지
	private String usebtnyn;		//사용버튼 사용 유무(Y,N)			
	private String usedttype;		//유효기간타입(D : 다운로드일 기준, P : 관리자 기간 입력 기준 )			
	private String usedtterm;		//다운로드일 기준 유효일			

	private String couponpubseq;	//쿠폰발행시퀀스
	private String couponnum;		//쿠폰번호
	private String userseq;			//사용자 시퀀스
	private String downdttm;		//쿠폰다운일시
	private String couponpubsttscd;	//쿠폰발행 상태(발행-1, 다운로드-2, 사용완료-3, 삭제-4, 기간만료-5)
	
	private String compnm;			//제휴사명
	
	private String readflag;		//쿠폰상세 읽음 여부
	
	private String sorttype;			//쿠폰타입 (A:카드, B:제휴사)
	private String newyn;			//추천 여부
	private String thumbimgurl;	//쿠폰 썸네일 이미지
	
	public String getCouponseq() {
		return couponseq;
	}
	public void setCouponseq(String couponseq) {
		this.couponseq = couponseq;
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
	public String getCouponnm() {
		return couponnm;
	}
	public void setCouponnm(String couponnm) {
		this.couponnm = couponnm;
	}
	public String getCoupontype() {
		return coupontype;
	}
	public void setCoupontype(String coupontype) {
		this.coupontype = coupontype;
	}
	public String getUsebgndttm() {
		return usebgndttm;
	}
	public void setUsebgndttm(String usebgndttm) {
		this.usebgndttm = usebgndttm;
	}
	public String getUseenddttm() {
		return useenddttm;
	}
	public void setUseenddttm(String useenddttm) {
		this.useenddttm = useenddttm;
	}
	public String getBgndttm() {
		return bgndttm;
	}
	public void setBgndttm(String bgndttm) {
		this.bgndttm = bgndttm;
	}
	public String getEnddttm() {
		return enddttm;
	}
	public void setEnddttm(String enddttm) {
		this.enddttm = enddttm;
	}
	public String getDiscountdesc() {
		return discountdesc;
	}
	public void setDiscountdesc(String discountdesc) {
		this.discountdesc = discountdesc;
	}
	public String getUseplace() {
		return useplace;
	}
	public void setUseplace(String useplace) {
		this.useplace = useplace;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getUsebtnyn() {
		return usebtnyn;
	}
	public void setUsebtnyn(String usebtnyn) {
		this.usebtnyn = usebtnyn;
	}
	public String getUsedttype() {
		return usedttype;
	}
	public void setUsedttype(String usedttype) {
		this.usedttype = usedttype;
	}
	public String getUsedtterm() {
		return usedtterm;
	}
	public void setUsedtterm(String usedtterm) {
		this.usedtterm = usedtterm;
	}
	public String getCouponpubseq() {
		return couponpubseq;
	}
	public void setCouponpubseq(String couponpubseq) {
		this.couponpubseq = couponpubseq;
	}
	public String getCouponnum() {
		return couponnum;
	}
	public void setCouponnum(String couponnum) {
		this.couponnum = couponnum;
	}
	public String getUserseq() {
		return userseq;
	}
	public void setUserseq(String userseq) {
		this.userseq = userseq;
	}
	public String getDowndttm() {
		return downdttm;
	}
	public void setDowndttm(String downdttm) {
		this.downdttm = downdttm;
	}
	public String getCouponpubsttscd() {
		return couponpubsttscd;
	}
	public void setCouponpubsttscd(String couponpubsttscd) {
		this.couponpubsttscd = couponpubsttscd;
	}
	public String getCompnm() {
		return compnm;
	}
	public void setCompnm(String compnm) {
		this.compnm = compnm;
	}
	public String getReadflag() {
		return readflag;
	}
	public void setReadflag(String readflag) {
		this.readflag = readflag;
	}
	public String getSorttype() {
		return sorttype;
	}
	public void setSorttype(String sorttype) {
		this.sorttype = sorttype;
	}
	public String getNewyn() {
		return newyn;
	}
	public void setNewyn(String newyn) {
		this.newyn = newyn;
	}
	public String getThumbimgurl() {
		return thumbimgurl;
	}
	public void setThumbimgurl(String thumbimgurl) {
		this.thumbimgurl = thumbimgurl;
	}
}
