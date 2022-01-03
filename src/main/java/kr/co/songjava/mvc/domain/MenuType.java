package kr.co.songjava.mvc.domain;

/**
 * @author ksme0
 * 메뉴 게시판 종류
 */
public enum MenuType {

	community(BoardType.COMMUNITY, "menu.community", "/community"),
	notice(BoardType.NOTICE, "menu.notice", "/notice"),
	faq(BoardType.FAQ, "menu.faq", "/faq"),
	inquiry(BoardType.INQUIRY, "menu.inquiry", "/inquiry"),
	;
	
	private BoardType boardType;
	private String menuCode;
	private String url;
	
	MenuType(BoardType boardType, String menuCode, String url) {
		this.boardType = boardType;
		this.menuCode = menuCode;
		this.url = url;
	}

	public BoardType boardType() {
		return boardType;
	}
	
	public String menuCode() {
		return menuCode;
	}
	
	public String url() {
		return url;
	}
}
