package net.daum.myone.frontapi.mvc.entity;


public class WebBaseCondition extends BaseCondition{

	private FastPageInfo fastpageinfo;
	
	private String countviewflagCond;
	
	public void bindFastTotalCount(int totalCount, int page) {
		this.fastpageinfo.setTotalCount(totalCount+page/this.fastpageinfo.getCountPerPageGroup()*this.fastpageinfo.getCountPerPage()*this.fastpageinfo.getCountPerPageGroup());
	}
	
	public void bindFastPageRange() {
		bindFastPageRange(getCountPerPage(), 10);
	}
	
	public void bindFastPageRange(int countPerPage) {
		bindFastPageRange(countPerPage, 10);
	}
	
	public void bindFastPageRange(int countPerPage, int countPerPageGroup) {
		this.fastpageinfo = new FastPageInfo(getPageCond(), countPerPage, countPerPageGroup);
		setStartnum((this.fastpageinfo.getCountPerPage() * (this.fastpageinfo.getPage()-1))+1);
		setFinishnum(getStartnum()+this.fastpageinfo.getCountPerPage()-1);
	}

	public FastPageInfo getFastpageinfo() {
		if(this.fastpageinfo==null) {
			this.fastpageinfo = new FastPageInfo();			
		}		
		return this.fastpageinfo;
	}

	public void setFastpageinfo(FastPageInfo fastpageinfo) {
		this.fastpageinfo = fastpageinfo;
	}

	public int getFastrownum() {
		return this.fastpageinfo.getCountPerPage()*this.fastpageinfo.getCountPerPageGroup();
	}

	public String getCountviewflagCond() {
		return countviewflagCond;
	}

	public void setCountviewflagCond(String countviewflagCond) {
		this.countviewflagCond = countviewflagCond;
	}

	
	
	
}
