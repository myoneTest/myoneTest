package net.daum.myone.frontapi.util;

import java.util.Map;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

@AutoProperty
public class JsonResult<T> {
	
	private String resultMsg;
	private String resultCode;
	private Map<String,T> resultList;
	
	public JsonResult() {
		this.setResultCode("E");
		this.setResultMsg("에러");
	}
	
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public Map<String, T> getResultList() {
		return resultList;
	}
	public void setResultList(Map<String, T> resultList) {
		this.resultList = resultList;
		this.changeStatus();
	}
	
	public void changeStatus() {
		this.setResultCode("Y");
		this.setResultMsg("성공");
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
