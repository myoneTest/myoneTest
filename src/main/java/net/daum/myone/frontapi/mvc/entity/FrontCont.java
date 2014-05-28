package net.daum.myone.frontapi.mvc.entity;

public class FrontCont extends MyoneCont {
public static String FRONT_USERSEQ = "-9";
	
	public static String BATCH_USERSEQ = "reissu";
	
	/**
	 * NS1000 length
	 */
	public static final String NS1000_LENGTH = "0066";
	/**
	 * NS2100 length
	 */
	public static final String NS2100_LENGTH = "0096";
	/**
	 * DS2100 length
	 */
	public static final String DS2100_LENGTH = "0656";
	/**
	 * DS2200 length
	 */
	public static final String DS2200_LENGTH = "0156";
	/**
	 * DS3100 length
	 */
	public static final String DS3100_LENGTH = "0136";
	/**
	 * DS3200 length
	 */
	public static final String DS3200_LENGTH = "0176";
	/**
	 * DS4100 length
	 */
	public static final String DS4100_LENGTH = "0206";
	/**
	 * SOCKET 응답코드 정상
	 */
	public static final String RSPN_CODE_SUCCES = "0000";
	/**
	 * SOCKET 응답코드 기타오류
	 */
	public static final String RSPN_CODE_ERR = "9999";	
	/**
	 * 송수신 FLAG SEND ( 다음에서 송신 )
	 */
	public static final String SR_FLAG_SEND = "S";	
	/**
	 * 송수신 FLAG RECIVE ( 제휴사에서 송신)
	 */
	public static final String SR_FLAG_RECV = "R";	
	/**
	 * SOCKET SPCVAN 카드가입/해지 전문요청
	 */
	public static final String TR_NS2100 = "NS2100";	
	/**
	 * SOCKET SPCVAN 통신망 관리 요청
	 */
	public static final String TR_NS1000 = "NS1000";	
	/**
	 * SOCKET 온라인 멤버십 가입/전환 요청
	 */
	public static final String TR_DS2100 = "DS2100";	
	/**
	 * SOCKET 온라인 멤버십 가입/전환 응답
	 */
	public static final String TR_DS2110 = "DS2110";	
	/**
	 * SOCKET 온라인 멤버십 해지 요청
	 */
	public static final String TR_DS2200 = "DS2200";	
	/**
	 * SOCKET 온라인 멤버십 해지 응답
	 */
	public static final String TR_DS2210 = "DS2210";	
	/**
	 * SOCKET 온라인 멤버십 포인트조회1 요청
	 */
	public static final String TR_DS3100 = "DS3100";	
	/**
	 * SOCKET 온라인 멤버십 포인트조회1 응답
	 */
	public static final String TR_DS3110 = "DS3110";	
	/**
	 * SOCKET 온라인 멤버십 포인트조회2 요청
	 */
	public static final String TR_DS3200 = "DS3200";
	/**
	 * SOCKET 온라인 멤버십 포인트조회2 응답
	 */
	public static final String TR_DS3210 = "DS3210";
	/**
	 * SOCKET 온라인 멤버십 특별포인트 적립(아모레)
	 */
	public static final String TR_DS4100 = "DS4100";
	/**
	 * 온라인 SOCKET 전문 공통 DATATYPECD : 신규(01)
	 */
	public static final String SOCKET_COMMON_DATATYPECD_01 = "01";
	/**
	 * 온라인 SOCKET 전문 공통 DATATYPECD : 전환(02)
	 */
	public static final String SOCKET_COMMON_DATATYPECD_02 = "02";
	/**
	 * 온라인 SOCKET 전문 공통 DATATYPECD : 해지(05)
	 */
	public static final String SOCKET_COMMON_DATATYPECD_05 = "05";
	/**
	 * 온라인 SOCKET 전문 공통 DATATYPECD : 해지(09) spc van 전용.
	 */
	public static final String SOCKET_COMMON_DATATYPECD_09 = "09";
	
	/**
	 * 온라인 SOCKET 전문 공통 DATATYPECD : 포인트조회(00)
	 */
	public static final String SOCKET_COMMON_DATATYPECD_00 = "00";
	
	/**
	 * 배치 사용자
	 */
	public static final String SERVER_USERSEQ = "-2";
	
	/**
	 * SPC 멤버십 가입
	 */
	public static final String SPC_MSHIP_JOIN = "1";
	/**
	 * SPC 멤버십 해지
	 */
	public static final String SPC_MSHIP_CLSE = "3";
	
	
	/**
	 * 제휴사 기준 해지된 멤버십
	 */
	public static final String RSPN_CODE_CLSE = "3399";
	
	/**
	 * 제휴사 기준 해지된 멤버십
	 */
	public static final String RSPN_CODE_EXIST = "8187";
	
	
	/**
	 * 제휴사전송 성별(남성)
	 */
	public static final String COMP_SEND_MALE = "1";
	/**
	 * 제휴사전송 성별(여성)
	 */
	public static final String COMP_SEND_FMALE = "2";
	
	
	/**
	 * SPC VAN 멤버십 가입 타입
	 */
	public static final String SPC_VAN_JOIN = "01";
	
	/**
	 * SPC VAN 멤버십 해지 타입
	 */
	public static final String SPC_VAN_CLSE = "09";
	
	/**
	 * CJONE 정상코드
	 */
	public static final String CJONE_RSPN_SUCUESS = "00000";
	
	/**
	 * CJONE 기등록정상코드
	 */
	public static final String CJONE_RSPN_ALREADY = "10007";
	
	/**
	 * CJONE ISSUR TYPECODE MYONE
	 */
	public static final String CJONE_DAUM_MYONE = "14";
	
	/**
	 * CJONE ISSUR TYPECODE DAUM
	 */
	public static final String CJONE_DAUM_WALLET = "20";
	
	
	/**
	 * SPC 멤버십 재가입 가능
	 */
	public static final String SPC_REJOIN_OK = "1";
	
	
	/**
	 * SPC 멤버십 재가입 불가
	 */
	public static final String SPC_REJOIN_NOT = "9";
	
	/**
	 * 본인확인서비스 회원사 아이디
	 */
	public static final String RESULT_CI_ID = "DUC009";
	//public static final String RESULT_CI_ID = "DUC008";
	
	
	/**
	 * 본인확인서비스 회원사 아이디(드림시큐리티)
	 */
	public static final String RESULT_CI_ID_DREAM = "daum";
	
	/**
	 * 본인확인서비스 서비스번호
	 */
	public static final String RESULT_CI_SRVNO = "005001";
	//public static final String RESULT_CI_SRVNO = "013001";
	
	/**
	 * 본인확인서비스 요청번호
	 */
	public static final String RESULT_CI_REQNUM = "2012110133993400";
	
	/**
	 * 본인확인서비스 요청번호 (드림시큐리티)
	 */
	public static final String RESULT_CI_REQNUM_DREAM = "DA2012110312012233";
	
	/**
	 * 본인확인서비스 복호화용 임시필드
	 */
	public static final String RESULT_CI_EXVAL = "0000000000000000";
	
	/**
	 * 본인확인서비스 본인확인 인증수단
	 */
	public static final String RESULT_CI_CERTGB = "H";
	
	/**
	 * 본인확인서비스 본인확인 인증수단
	 */
	public static final String RESULT_CI_URL = "https://pcc.siren24.com/pcc_V3/jsp/pcc_V3_j10.jsp";
	
	
	/**
	 * 현대 멀티멤버십 CARDGODSID
	 */
	public static final String HYUNDAI_MEMBERSHIPCARD_CARDGODSID = "1006";
}
