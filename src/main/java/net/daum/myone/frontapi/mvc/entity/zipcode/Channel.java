package net.daum.myone.frontapi.mvc.entity.zipcode;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("channel")
public class Channel {

	private String title;
	private String description;
	private String q;
	
	private Header header;
	private List<Data> ds;
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public String getQ() {
		return q;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setQ(String q) {
		this.q = q;
	}
	
	public void setHeader(Header header) {
		this.header = header;
	}
	public Header getHeader() {
		return header;
	}
	public List<Data> getDs() {
		return ds;
	}
	public void setDs(List<Data> ds) {
		this.ds = ds;
	}
	
	
}
