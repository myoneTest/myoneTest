package net.daum.myone.frontapi.mvc.entity;

import java.util.List;



public class ContSet extends FrontBaseEntity {
	private String setseq;		//셋시퀀스
	private String areaid;		//영역ID
	private String cateid;		//카테ID
	private String bgndttm;		//노출시작일시
	private String enddttm;		//노출종료일시
	
	private String catename;	//카테명
	
	private List<ContSetValue> contsetvaluelist;	//셋밸류리스트
	
	/**
	 * 쿠폰
	 * @param idx
	 * @return
	 */
	public Coupon getCoupon(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getCoupon();		
	}
	
	/**
	 * 쿠폰시퀀스
	 * @param idx
	 * @return
	 */
	public String getCouponseq(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getCouponseq();
	}
	
	/**
	 * 제휴사
	 * @param idx
	 * @return
	 */
	public Comp getComp(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getComp();		
	}
	
	/**
	 * 제휴사 ID
	 * @param idx
	 * @return
	 */
	public String getCompid(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getCompid();		
	}
	
	/**
	 * 이벤트
	 * @param idx
	 * @return
	 */
	public Event getEvent(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getEvent();		
	}
	
	/**
	 * 이벤트ID
	 * @param idx
	 * @return
	 */
	public String getEventid(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getEventid();		
	}
	
	/**
	 * 공지사항
	 * @param idx
	 * @return
	 */
	public Notice getNotice(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getNotice();		
	}
	
	/**
	 * 공지사항ID
	 * @param idx
	 * @return
	 */
	public String getNoticeid(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getNoticeid();		
	}
	
	/**
	 * 텍스트
	 * @param idx
	 * @return
	 */
	public String getText(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getText();		
	}
	
	/**
	 * 이미지
	 * @param idx
	 * @return
	 */
	public String getImgurl(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getImgurl();		
	}
	
	/**
	 * 이미지 2개가 쌍인 중 첫번째 이미지 가져오기
	 * @param idx
	 * @return
	 */
	public String getDoubleImgurl1(int idx) {
		int ridx = idx*2-1;		
		ContSetValue value = getContSetValue(ridx);
		return value.getImgurl();		
	}
	
	/**
	 * 이미지 2개가 쌍인 중 두번째 이미지 가져오기
	 * @param idx
	 * @return
	 */
	public String getDoubleImgurl2(int idx) {
		int ridx = idx*2;		
		ContSetValue value = getContSetValue(ridx);
		return value.getImgurl();		
	}
	
	/**
	 * 링크url
	 * @param idx
	 * @return
	 */
	public String getLinkurl(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getLinkurl();		
	}
	
	/**
	 * htmltext
	 * @param idx
	 * @return
	 */
	public String getHtmltext(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getHtmltext();		
	}
	
	/**
	 * code
	 * @param idx
	 * @return
	 */
	public String getCode(int idx) {
		ContSetValue value = getContSetValue(idx);
		return value.getCode();
	}
	
	/**
	 * ++event
	 * @param codecate
	 * @return
	 */
	public String getCode(String codecate) {
		
		for (ContSetValue contSetValue : contsetvaluelist) {			
			if(codecate.equals(contSetValue.getCodecate())) {
				return contSetValue.getCode();
			}
		}
		
		return null;
	}
	
	public ContSetValue getContSetValue(int num) {
		
		for (ContSetValue contSetValue : contsetvaluelist) {
			
			if(contSetValue.getValuenum() == num) {
				return contSetValue;
			}
		}
		
		return new ContSetValue();
	}
	
	//getter, setter
	
	public String getSetseq() {
		return setseq;
	}
	public void setSetseq(String setseq) {
		this.setseq = setseq;
	}
	public String getCateid() {
		return cateid;
	}
	public void setCateid(String cateid) {
		this.cateid = cateid;
	}
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	public List<ContSetValue> getContsetvaluelist() {
		return contsetvaluelist;
	}
	public void setContsetvaluelist(List<ContSetValue> contsetvaluelist) {
		this.contsetvaluelist = contsetvaluelist;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}

	public String getBgndttm() {
		return bgndttm;
	}

	public String getEnddttm() {
		return enddttm;
	}

	public void setBgndttm(String bgndttm) {
		this.bgndttm = bgndttm;
	}

	public void setEnddttm(String enddttm) {
		this.enddttm = enddttm;
	}
}
