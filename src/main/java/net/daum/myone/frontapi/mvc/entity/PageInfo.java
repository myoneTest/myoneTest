package net.daum.myone.frontapi.mvc.entity;

public class PageInfo {
	private int totalArticleCount;
	private int totalCount;
	private int page;
	private int countPerPage;
	private int countPerPageGroup;
	private int totalPage;
	
	public PageInfo(){}

	/**
	 * 
	 * @param totalArticleCount 총 개수
	 * @param page 현재 페이지
	 * @param countPerPage 페이지당 글수
	 * @param countPerPageGroup 페이지 그룹 당 페이지 개수
	 */
	public PageInfo(int totalArticleCount, int page, int countPerPage, int countPerPageGroup) {
		this.totalCount = totalArticleCount;
		this.totalArticleCount = totalArticleCount;
		this.page = page;
		this.countPerPage = countPerPage;
		this.countPerPageGroup = countPerPageGroup;
		getTotalPage();
	}

	public PageInfo(int page, int countPerPage, int countPerPageGroup) {
		this.page = page;
		this.countPerPage = countPerPage;
		this.countPerPageGroup = countPerPageGroup;
	}
	
	/**페이지 그룹이 필요하지 않은 경우 사용
	 * @param page
	 * @param countPerPage
	 */
	public PageInfo(int page, int countPerPage) {
		this.page = page;
		this.countPerPage = countPerPage;
	}
	
	
	public void setPage(int page) {
		this.page = page;
	}
	public int getPage() {
		return page;
	}

	public void setCountPerPage(int countPerPage) {
		this.countPerPage = countPerPage;
	}
	public int getCountPerPage() {
		return countPerPage;
	}
	
	public int getCountPerPageGroup() {
		return countPerPageGroup;
	}

	public void setTotalArticleCount(int totalArticleCount) {
		this.totalArticleCount = totalArticleCount;
	}
	public int getTotalArticleCount() {
		return totalArticleCount;
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
		totalPage = totalArticleCount / countPerPage;
		if (totalArticleCount % countPerPage > 0 || totalPage == 0) totalPage++;
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
	
	public int getStartPageOfPrevGroup(){
		int startPageOfPrevGroup = ((page / countPerPageGroup) - 1) * countPerPageGroup + 1;
		return startPageOfPrevGroup < 0 ? 1 : startPageOfPrevGroup;
	}
	
	public int getEndPageOfPrevGroup(){
		return (page / countPerPageGroup) * countPerPageGroup;
	}
	
	public int getStartPageOfNextGroup(){
		int startPageOfNextGroup = 
			((page % countPerPageGroup) == 0 ? page / countPerPageGroup : page / countPerPageGroup + 1) * countPerPageGroup + 1;
		return startPageOfNextGroup <= getTotalPage() ? startPageOfNextGroup : getTotalPage();
	}
	
	public int getEndPageOfNextGroup(){
		int endPageOfNextGroup = getStartPageOfNextGroup() + countPerPageGroup - 1;
		return endPageOfNextGroup <= getTotalPage() ? endPageOfNextGroup : getTotalPage();
	}
	
	public int getStart() {
		return (page - 1) * countPerPage + 1;
	}
	
	public int getEnd() {
		return (page - 1) * countPerPage + countPerPage;
	}

	/**
	 * 조회용 Page 순서
	 */
	public int getViewStartNo() {
		return totalArticleCount - ((page-1)*countPerPage);
	}
}
