package net.daum.myone.frontapi.mvc.entity.zipcode;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("header")
public class Header {
	
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
