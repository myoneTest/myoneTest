package net.daum.myone.frontapi.mvc.entity.zipcode;


import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("address")
@AutoProperty
public class Address {
	
	private String zipcode;
	private String region;
	private String name1;
	private String name2;
	private String name3;
	private String name4;
	private String nameisland;
	private String mtyn;
	private String stmasn;
	private String stsbsn;
	private String enmasn;
	private String ensbsn;
	private String aptbdnm;
	private String stdong;
	private String endong;
	
	public String getZipcode() {
		return zipcode;
	}
	public String getRegion() {
		return region;
	}
	public String getName1() {
		return name1;
	}
	public String getName2() {
		return name2;
	}
	public String getName3() {
		return name3;
	}
	public String getName4() {
		return name4;
	}
	public String getNameisland() {
		return nameisland;
	}
	public String getMtyn() {
		return mtyn;
	}
	public String getStmasn() {
		return stmasn;
	}
	public String getStsbsn() {
		return stsbsn;
	}
	public String getEnmasn() {
		return enmasn;
	}
	public String getEnsbsn() {
		return ensbsn;
	}
	public String getAptbdnm() {
		return aptbdnm;
	}
	public String getStdong() {
		return stdong;
	}
	public String getEndong() {
		return endong;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public void setName3(String name3) {
		this.name3 = name3;
	}
	public void setName4(String name4) {
		this.name4 = name4;
	}
	public void setNameisland(String nameisland) {
		this.nameisland = nameisland;
	}
	public void setMtyn(String mtyn) {
		this.mtyn = mtyn;
	}
	public void setStmasn(String stmasn) {
		this.stmasn = stmasn;
	}
	public void setStsbsn(String stsbsn) {
		this.stsbsn = stsbsn;
	}
	public void setEnmasn(String enmasn) {
		this.enmasn = enmasn;
	}
	public void setEnsbsn(String ensbsn) {
		this.ensbsn = ensbsn;
	}
	public void setAptbdnm(String aptbdnm) {
		this.aptbdnm = aptbdnm;
	}
	public void setStdong(String stdong) {
		this.stdong = stdong;
	}
	public void setEndong(String endong) {
		this.endong = endong;
	}
	
	@Override
	public boolean equals(Object o) {
		return Pojomatic.equals(this, o);
	}
	@Override
	public int hashCode() {
		return Pojomatic.hashCode(this);
	}
	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}
}
