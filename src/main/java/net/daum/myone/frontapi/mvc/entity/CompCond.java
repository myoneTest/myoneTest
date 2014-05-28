package net.daum.myone.frontapi.mvc.entity;

public class CompCond extends WebBaseCondition {
	private String myoneidCond;
	private String ciCond;
	private String regtypeCond;
	private String[] regtypesCond;	
	private String othercardmembershipCond;		//다른 카드에 연결된 제휴사 가져온다
	private String[] cardmemberreshipsCond;
	private String[] excludecompidsCond;
	private String areaidCond;
	private String[] compidsCond;
	private String[] myoneidsCond;
	private String binnumCond;
	private String failcompidsCond;				//일괄연결 실패 compid - ','로 구분
	private String userseqCond;
	private String isHyundaiMemberShipYn;
	private String cardgodsidcond;
	
	public String getMyoneidCond() {
		return myoneidCond;
	}
	public void setMyoneidCond(String myoneidCond) {
		this.myoneidCond = myoneidCond;
	}
	public String getCiCond() {
		return ciCond;
	}
	public void setCiCond(String ciCond) {
		this.ciCond = ciCond;
	}
	public String getRegtypeCond() {
		return regtypeCond;
	}
	public void setRegtypeCond(String regtypeCond) {
		this.regtypeCond = regtypeCond;
	}
	public String[] getRegtypesCond() {
		return regtypesCond;
	}
	public void setRegtypesCond(String[] regtypesCond) {
		this.regtypesCond = regtypesCond;
	}
	public String getOthercardmembershipCond() {
		return othercardmembershipCond;
	}
	public void setOthercardmembershipCond(String othercardmembershipCond) {
		this.othercardmembershipCond = othercardmembershipCond;
	}
	public String[] getCardmemberreshipsCond() {
		return cardmemberreshipsCond;
	}
	public void setCardmemberreshipsCond(String[] cardmemberreshipsCond) {
		this.cardmemberreshipsCond = cardmemberreshipsCond;
	}
	public String[] getExcludecompidsCond() {
		return excludecompidsCond;
	}
	public void setExcludecompidsCond(String[] excludecompidsCond) {
		this.excludecompidsCond = excludecompidsCond;
	}
	public String getAreaidCond() {
		return areaidCond;
	}
	public void setAreaidCond(String areaidCond) {
		this.areaidCond = areaidCond;
	}
	public String[] getCompidsCond() {
		return compidsCond;
	}
	public void setCompidsCond(String[] compidsCond) {
		this.compidsCond = compidsCond;
	}
	public String[] getMyoneidsCond() {
		return myoneidsCond;
	}
	public void setMyoneidsCond(String[] myoneidsCond) {
		this.myoneidsCond = myoneidsCond;
	}
	public String getBinnumCond() {
		return binnumCond;
	}
	public void setBinnumCond(String binnumCond) {
		this.binnumCond = binnumCond;
	}
	public String getFailcompidsCond() {
		return failcompidsCond;
	}
	public void setFailcompidsCond(String failcompidsCond) {
		this.failcompidsCond = failcompidsCond;
	}
	public String getUserseqCond() {
		return userseqCond;
	}
	public void setUserseqCond(String userseqCond) {
		this.userseqCond = userseqCond;
	}
	public String getIsHyundaiMemberShipYn() {
		return isHyundaiMemberShipYn;
	}
	public void setIsHyundaiMemberShipYn(String isHyundaiMemberShipYn) {
		this.isHyundaiMemberShipYn = isHyundaiMemberShipYn;
	}
	public String getCardgodsidcond() {
		return cardgodsidcond;
	}
	public void setCardgodsidcond(String cardgodsidcond) {
		this.cardgodsidcond = cardgodsidcond;
	}
}
