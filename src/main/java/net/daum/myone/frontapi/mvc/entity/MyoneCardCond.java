package net.daum.myone.frontapi.mvc.entity;


public class MyoneCardCond extends WebBaseCondition{

	private String ciCond;
	private String sttscdCond;
	private String exceptCompidCond;
	private String existMemberShipCond;		//Y:연결된, N:연결안된
	private String existsCompidCond;
	private String orderMyoneidCond;	
	private String regtypeCond;
	private String ignoresttscdCond;			//상태 무시
	private String userseqCond;
	private String clselostdtCond;
	private String orderCardgodsidCond;
	
	public String getCiCond() {
		return ciCond;
	}
	public void setCiCond(String ciCond) {
		this.ciCond = ciCond;
	}
	public String getSttscdCond() {
		return sttscdCond;
	}
	public void setSttscdCond(String sttscdCond) {
		this.sttscdCond = sttscdCond;
	}
	public String getExceptCompidCond() {
		return exceptCompidCond;
	}
	public void setExceptCompidCond(String exceptCompidCond) {
		this.exceptCompidCond = exceptCompidCond;
	}
	public String getExistMemberShipCond() {
		return existMemberShipCond;
	}
	public void setExistMemberShipCond(String existMemberShipCond) {
		this.existMemberShipCond = existMemberShipCond;
	}
	public String getExistsCompidCond() {
		return existsCompidCond;
	}
	public void setExistsCompidCond(String existsCompidCond) {
		this.existsCompidCond = existsCompidCond;
	}
	public String getOrderMyoneidCond() {
		return orderMyoneidCond;
	}
	public void setOrderMyoneidCond(String orderMyoneidCond) {
		this.orderMyoneidCond = orderMyoneidCond;
	}
	public String getRegtypeCond() {
		return regtypeCond;
	}
	public void setRegtypeCond(String regtypeCond) {
		this.regtypeCond = regtypeCond;
	}
	public String getIgnoresttscdCond() {
		return ignoresttscdCond;
	}
	public void setIgnoresttscdCond(String ignoresttscdCond) {
		this.ignoresttscdCond = ignoresttscdCond;
	}
	public String getUserseqCond() {
		return userseqCond;
	}
	public void setUserseqCond(String userseqCond) {
		this.userseqCond = userseqCond;
	}
	public String getClselostdtCond() {
		return clselostdtCond;
	}
	public void setClselostdtCond(String clselostdtCond) {
		this.clselostdtCond = clselostdtCond;
	}
	public String getOrderCardgodsidCond() {
		return orderCardgodsidCond;
	}
	public void setOrderCardgodsidCond(String orderCardgodsidCond) {
		this.orderCardgodsidCond = orderCardgodsidCond;
	}
	
}
