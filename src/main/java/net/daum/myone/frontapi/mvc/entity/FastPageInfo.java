package net.daum.myone.frontapi.mvc.entity;

public class FastPageInfo {
	private int totalCount;
	private int page;
	private int countPerPage;
	private int countPerPageGroup;
	private int totalPage;
	
	public FastPageInfo(){}

	public FastPageInfo(int page, int countPerPage, int countPerPageGroup) {
		this.page = page;
		this.countPerPage = countPerPage;
		this.countPerPageGroup = countPerPageGroup;
	}
	
	public int getPage() {
		return page;
	}

	public int getCountPerPage() {
		return countPerPage;
	}
	
	public int getCountPerPageGroup() {
		return countPerPageGroup;
	}
	
	public int getTotalCount() {
		return totalCount;
	}

	public int getFirstPageInGroup() {
		int startPage =((page - 1) / countPerPageGroup) * countPerPageGroup + 1;
		if (startPage < 1) startPage = 1;
		return (startPage > totalPage ? totalPage : startPage);
	}

	public int getLastPageInGroup() {
		int lastPage = getFirstPageInGroup() + (countPerPageGroup - 1);
		if (lastPage > totalPage) lastPage = totalPage; 
		return lastPage;
	}
	
	public int getTotalPage() {
		totalPage = totalCount / countPerPage;
		if (totalCount % countPerPage > 0 || totalPage == 0) totalPage++;
		return totalPage;
	}

	public boolean getHasPrevPageGroup() {
		return (getFirstPageInGroup() > 1);
	}

	public boolean getHasNextPageGroup() {
		return (getLastPageInGroup() < totalPage);
	}

	public int getNextPageOfGroup() {
		int endOfPageGroup = getLastPageInGroup();
		return (getHasNextPageGroup() ? endOfPageGroup + 1 : endOfPageGroup);
	}

	public int getPrevPageOfGroup() {
		int startOfPageGroup = getFirstPageInGroup();
		return (getHasPrevPageGroup() ? startOfPageGroup - 1 : startOfPageGroup);
	}
	
	public int getStart() {
		return (page - 1) * countPerPage + 1;
	}
	
	public int getEnd() {
		return (page - 1) * countPerPage + countPerPage;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		getTotalPage();
	}
}
