package net.daum.myone.frontapi.mvc.entity;


import com.thoughtworks.xstream.annotations.XStreamOmitField;

public class FrontBaseEntity {
	private String fstrgstid = FrontCont.FRONT_USERSEQ;
	private String fstrgstdttm;
	private String lstchngmnid = FrontCont.FRONT_USERSEQ;
	@XStreamOmitField
	private String lstchngdttm;
	
	public String getFstrgstid() {
		return fstrgstid;
	}
	public String getFstrgstdttm() {
		return fstrgstdttm;
	}
	public String getLstchngmnid() {
		return lstchngmnid;
	}
	public String getLstchngdttm() {
		return lstchngdttm;
	}
	public void setFstrgstid(String fstrgstid) {
		this.fstrgstid = fstrgstid;
	}
	public void setFstrgstdttm(String fstrgstdttm) {
		this.fstrgstdttm = fstrgstdttm;
	}
	public void setLstchngmnid(String lstchngmnid) {
		this.lstchngmnid = lstchngmnid;
	}
	public void setLstchngdttm(String lstchngdttm) {
		this.lstchngdttm = lstchngdttm;
	}
}
