package net.daum.myone.frontapi.mvc.entity;

public class MyoneCont {
	
	/**
	 * 발급구분 : 신규발급(10)
	 */
	public static final String MYONECARD_ISSURTYPECD_NEW = "10";	
	/**
	 * 발급구분 : 재발급(40)
	 */
	public static final String MYONECARD_ISSURTYPECD_AGAIN = "40";
	
	/**
	 * 등록타입 : 선등록(A)
	 */
	public static final String MYONECARD_REGTYPE_A = "A";	
	/**
	 * 등록타입 : 후등록(B)
	 */
	public static final String MYONECARD_REGTYPE_B = "B";
	
	/**
	 * 해지전문구분 : 해지(10)
	 */
	public static final String WORKMS1104_ISSURTYPECD_CANCEL = "10";	
	/**
	 * 해지전문구분 : 해당 고객과 카드사의 모든 카드해지, 멤버십해지
	 */
	public static final String WORKMS1104_ISSURTYPECD_CANCEL_ALL = "11";
	/**
	 * 해지전문구분 : 복구(20)
	 */
	public static final String WORKMS1104_ISSURTYPECD_RECOVERY = "20";
		
	
	/**
	 * 카드유형구분 : 신용카드(11)
	 */
	public static final String CARDTYPECD_CREDIT = "11";	
	/**
	 * 카드유형구분 : 체크카드(21)
	 */
	public static final String CARDTYPECD_CHECK = "21";
	
	
	/**
	 * 카드상품코드
	 */
	
	/**
	 * 거래구분
	 */
	
	/**
	 * 변경구분 : 변경있음(0)
	 */
	public static final String CHNGTYPECD_YES = "0";	
	
	/**
	 * 변경구분 : 변경없음(1)
	 */
	public static final String CHNGTYPECD_NO = "1";
	
	/**
	 * 처리상태 : 처리(Y)
	 */
	public static final String EXECFLAG_YES = "Y";
	/**
	 * 처리상태 : CI변환처리(C)
	 */
	public static final String EXECFLAG_CI = "C";
	/**
	 * 처리상태 : CI변환 미처리(N)
	 */
	public static final String EXECFLAG_NO = "N";
	/**
	 * 처리상태 : 에러(E)
	 */
	public static final String EXECFLAG_ERR = "E";
	/**
	 * 처리상태 : 전송(S)
	 */
	public static final String EXECFLAG_SEND = "S";
	/**
	 * 처리상태 : 응답(R)
	 */
	public static final String EXECFLAG_RES = "R";
	/**
	 * 처리상태 : 통신장애(I)
	 */
	public static final String EXECFLAG_ITR = "I";
	
	/**
	 * 해당값은 카드번호 앞자리를 체크하여 3 -> J , 4 -> V , 5 -> M , 9 -> L 로 저장함.
		cf )  X 는 kb 카드만 해당 filler 에 1 byte 가 '1' 이면 X 로 저장함. ( 통합전문의 filler 이용, 구전문에는 체크카드계좌연동여부 필드 사용했슴.)
      	kb카드 전문에서 X 로 들어오는 값은 마이원서비스가 불가한 카드로 상태값을 '9' 로 저장함.
	 * 카드빈 구분 : VISA(V)
	 */
	public static final String CARDBINCHK_VISA = "V";
	/**
	 * 카드빈 구분 : MASTER(M)
	 */
	public static final String CARDBINCHK_MSTER = "M";
	/**
	 * 카드빈 구분 : LOCAL(L)
	 */
	public static final String CARDBINCHK_LOCAL = "L";
	/**
	 * 카드빈 구분 : JCB(J)
	 */
	public static final String CARDBINCHK_JCB = "J";
	/**
	 * 카드빈 구분 : KB MOBILE(X)
	 */
	public static final String CARDBINCHK_KBMOBILE = "X";
	/**
	 * 카드빈 구분 : NH IC ( I )
	 */
	public static final String CARDBINCHK_NHIC = "I";
	
	/**
	 * 카드상태코드 : 정상(1)
	 */
	public static final String MYONECARD_STTSCD_1 = "1";
	/**
	 * 카드상태코드 : 해지(9)
	 */
	public static final String MYONECARD_STTSCD_9 = "9";
	
	/**
	 * 성별 : 남(M)
	 */
	public static final String GENDER_MALE = "M";
	/**
	 * 성별 : 여(F)
	 */
	public static final String GENDER_FEMALE = "F";
	
	/**
	 * 멤버십상태 : 등록처리중(0)
	 */
	public static final String MEMBERSHIP_STTSCD_0 = "0";
	/**
	 * 멤버십상태 : 등록완료(1)
	 */
	public static final String MEMBERSHIP_STTSCD_1 = "1";
	/**
	 * 멤버십상태 : 해지처리중(8)
	 */
	public static final String MEMBERSHIP_STTSCD_8 = "8";
	/**
	 * 멤버십상태 : 해지완료(9)
	 */
	public static final String MEMBERSHIP_STTSCD_9 = "9";
	
	/**
	 * 멤버십 해지사유 : 카드해지로 인한 멤버십 해지(M1)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_M1 = "M1";
	/**
	 * 멤버십 해지사유 : 카드 복구로 인해 멤버십 상태복구(MR)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_MR = "MR";
	/**
	 * 멤버십 해지사유 : 제휴사 서비스 종료로 인한 해지(C1)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_C1 = "C1";
	/**
	 * 멤버십 해지사유 : 1:1 제휴사인 경우 타 카드로 멤버십 등록하는 경우 해지(C2)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_C2 = "C2";
	/**
	 * 멤버십 해지사유 : 제휴멤버십 불만(01)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_01 = "01";
	/**
	 * 멤버십 해지사유 : 마이원서비스 불만(02)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_02 = "02";
	/**
	 * 멤버십 해지사유 : 타 통합 멤버십 서비스 사용(03)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_03 = "03";
	/**
	 * 멤버십 해지사유 : 자체 회원카드 사용(04)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_04 = "04";
	/**
	 * 멤버십 해지사유 : 제휴사에서 해지된 사용자(05)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_05 = "05";
	/**
	 * 멤버십 해지사유 : 선발급 카드 해지(08)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_08 = "08";
	/**
	 * 멤버십 해지사유 : 온라인 해지 기타(09)
	 */
	public static final String MEMBERSHIP_CLSETYPECD_09 = "09";
	
	/**
	 * 멤버십 유입경로 : 마이원(10)
	 */
	public static final String MEMBERSHIP_DAUMTYPECD_10 = "10";
	
	/**
	 * 멤버십 유입경로 : 마이원(30) 모바일 접근시
	 */
	public static final String MEMBERSHIP_DAUMTYPECD_30 = "30";
	
	/**
	 * 멤버십 유입경로 : 마이원(50) 모바일 접근시
	 */
	public static final String MEMBERSHIP_DAUMTYPECD_50 = "50";
	
	
	/**
	 * 온라인 XML 전문 공통 DATATYPECD : 신규(01)
	 */
	public static final String XML_COMMON_DATATYPECD_01 = "01";
	/**
	 * 온라인 XML 전문 공통 DATATYPECD : 전환(02)
	 */
	public static final String XML_COMMON_DATATYPECD_02 = "02";
	/**
	 * 온라인 XML 전문 공통 DATATYPECD : 해지(05)
	 */
	public static final String XML_COMMON_DATATYPECD_05 = "05";
	/**
	 * 온라인 XML 전문 공통 DATATYPECD : 포인트조회(00)
	 */
	public static final String XML_COMMON_DATATYPECD_00 = "00";
	
	/**
	 * 회원상태 : 가입(1)
	 */
	public static final String USER_STTSCD_1 = "1";
	/**
	 * 회원상태 : 탈퇴(9)
	 */
	public static final String USER_STTSCD_9 = "9";
	
	/**
	 * 회원타입 : 구마이원(WEB)
	 */
	public static final String USER_JOINTYPE_WEB = "WEB";
	/**
	 * 회원타입 : 앱(APP)
	 */
	public static final String USER_JOINTYPE_APP = "APP";
	
	/**
	 * 제휴사 : 등록타입 : 마이원(A)
	 */
	public static final String COMP_REGTYPE_A = "A";
	/**
	 * 제휴사 : 등록타입 :  후등록(B)
	 */
	public static final String COMP_REGTYPE_B = "B";
	/**
	 * 제휴사 : 등록타입 : 마이원+후등록(C)
	 */
	public static final String COMP_REGTYPE_C = "C";
	
	
	/**
	 * 약관 : 약관타입 : 다음에서 제휴사로 데이터 넘기는것 동의 약관(00)
	 */
	public static final String COMPRULE_RULETYPECD_00 = "00";
	/**
	 * 약관 : 약관타입 : 이용약관(10)
	 */
	public static final String COMPRULE_RULETYPECD_10 = "10";
	/**
	 * 약관 : 약관타입 : 개인정보수집및 안내(20)
	 */
	public static final String COMPRULE_RULETYPECD_20 = "20";
	
	
	/**
	 * 쿠폰발행상태 : 발행(1)
	 */
	public static final String COUPONPUB_STTSCD_1 = "1";
	/**
	 * 쿠폰발행상태 : 다운로드(2)
	 */
	public static final String COUPONPUB_STTSCD_2 = "2";
	/**
	 * 쿠폰발행상태 : 사용완료(3)
	 */
	public static final String COUPONPUB_STTSCD_3 = "3";
	/**
	 * 쿠폰발행상태 : 삭제(4)
	 */
	public static final String COUPONPUB_STTSCD_4 = "4";
	/**
	 * 쿠폰발행상태 : 기간만료(5)
	 */
	public static final String COUPONPUB_STTSCD_5 = "5";
	
}
