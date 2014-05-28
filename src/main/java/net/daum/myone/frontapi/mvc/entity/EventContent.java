package net.daum.myone.frontapi.mvc.entity;


public class EventContent extends ContSet {
	public String getSubject() {
		//제목
		return getText(1);
	}
	
	public String getJoinMessage() {
		//참여완료 메세지
		return getText(2);
	}
	
	public String getSnsMessage() {
		//sns 전송 문구
		return getText(3);
	}
	
	public String getErrMessage() {
		//에러메세지
		return getText(5);
	}
	
	public String getBanImgurl() {
		//배너이미지
		return getImgurl(1);
	}
	
	public String getBanImgurl2() {
		//배너이미지2
		return getImgurl(2);
	}
	
	public String getBigBanImgurl() {
		//빅배너이미지
		return getImgurl(3);
	}
	
	public String getBigBanImgurl2() {
		//빅배너이미지2
		return getImgurl(4);
	}
	
	public String getMainBanImgurl() {
		//메인배너이미지
		return getImgurl(5);
	}
	
	public String getMainBanImgurl2() {
		//메인배너이미지2
		return getImgurl(6);
	}
	
	public String getJoinurl() {
		//참여하기 웹 url
		return getLinkurl(1);
	}
	
	public String getSnsWebUrl() {
		//sns 웹 url
		return getLinkurl(2);
	}
	
	public String getSnsAppUrl() {
		//sns 앱 url
		return getLinkurl(3);
	}
	
	public String getContent() {
		//상세내용
		return getHtmltext(1);
	}
	
	public String getContentyn() {
		//상세페이지 여부(Y:상세페이지로 이동, N:jointype에 따름)
		return getCode("C_EVENT_DESC_YN");
	}
	
	public String getJointype() {
		//참여하기 액션(1:웹url로이동 getJoinurl, 2:제휴상세페이지, 3:카드등록페이지, 4:회원인증페이지, 5:쿠폰상세, 6:공지사항, 7:sns) 
		return getCode("C_EVENT_JOINTYPE");
	}
	
	public String getBanColor() {
		//배너배경색
		return getCode("C_EVENT_BANCOLOR");
	}
}
