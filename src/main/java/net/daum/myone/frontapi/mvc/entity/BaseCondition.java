package net.daum.myone.frontapi.mvc.entity;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BaseCondition{
	
	private String ordertypeCond;		//정렬타입(가급적이면 A[디폴트값], B, C, ....로 사용)
	private int pageCond=1;				//현재페이지	
	
	private int startnum=1;				//시작로우
	private int finishnum=100;			//종료로우
	private String pagingflag;			//페이징여부
	
	private PageInfo pageinfo;			//페이지네비게이션정보
	
	private int countPerPage=20;
	
	private String ftlCond;
	private String multiflagCond;
	
	private String searchtypeCond;
	private String searchvalueCond;
	
	public int getViewStartNo(){
		return pageinfo.getViewStartNo();
	}
	
	public void bindPageInfo(int totrow) {
		bindPageInfo(totrow, countPerPage, 10);
	}
	
	public void bindPageInfo(int totrow, int countPerPage) {
		bindPageInfo(totrow, countPerPage, 10);
	}
	
	public void bindPageInfo(int totrow, int countPerPage, int countPerPageGroup) {
		this.pageinfo = new PageInfo(totrow, this.pageCond, countPerPage, countPerPageGroup);
		this.startnum = (pageinfo.getCountPerPage() * (pageinfo.getPage()-1))+1;
		this.finishnum = this.startnum+this.pageinfo.getCountPerPage()-1;
	}
	
	public void bindPageInfoMysql(int totrow, int countPerPage) {
		bindPageInfoMysql(totrow, countPerPage, 10);
	}
	
	public void bindPageInfoMysql(int totrow, int countPerPage, int countPerPageGroup) {
		this.pageinfo = new PageInfo(totrow, this.pageCond, countPerPage, countPerPageGroup);
		this.startnum = (pageinfo.getCountPerPage() * (pageinfo.getPage()-1));
		this.finishnum = this.pageinfo.getCountPerPage();
	}
	
    public String string() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

	public int getPageCond() {
		return pageCond;
	}

	public void setPageCond(int pageCond) {
		if(pageCond == 0) {
			this.pageCond = 1;
		} else {
			this.pageCond = pageCond;
		}
	}

	public int getStartnum() {
		return startnum;
	}

	public void setStartnum(int startnum) {
		this.startnum = startnum;
	}

	public int getFinishnum() {
		return finishnum;
	}

	public void setFinishnum(int finishnum) {
		this.finishnum = finishnum;
	}

	public String getPagingflag() {
		return pagingflag;
	}

	public void setPagingflag(String pagingflag) {
		this.pagingflag = pagingflag;
	}

	public PageInfo getPageinfo() {
		if(this.pageinfo==null) {
			this.pageinfo = new PageInfo();			
		}		
		return pageinfo;
	}

	public void setPageinfo(PageInfo pageinfo) {
		this.pageinfo = pageinfo;
	}

	public int getCountPerPage() {
		return countPerPage;
	}

	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}

	public String getOrdertypeCond() {
		return ordertypeCond;
	}

	public void setOrdertypeCond(String ordertypeCond) {
		this.ordertypeCond = ordertypeCond;
	}

	public String getFtlCond() {
		return ftlCond;
	}

	public void setFtlCond(String ftlCond) {
		this.ftlCond = ftlCond;
	}

	public String getMultiflagCond() {
		return multiflagCond;
	}

	public void setMultiflagCond(String multiflagCond) {
		this.multiflagCond = multiflagCond;
	}

	public String getSearchtypeCond() {
		return searchtypeCond;
	}

	public void setSearchtypeCond(String searchtypeCond) {
		this.searchtypeCond = searchtypeCond;
	}

	public String getSearchvalueCond() {
		return searchvalueCond;
	}

	public void setSearchvalueCond(String searchvalueCond) {
		this.searchvalueCond = searchvalueCond;
	}


}
