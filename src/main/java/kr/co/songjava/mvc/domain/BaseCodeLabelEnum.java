package kr.co.songjava.mvc.domain;

/**
 * @author ksme0
 * 기본 codeLabelEnum
 */
public interface BaseCodeLabelEnum {
	
	
	/**
	 * 코드를 리턴.
	 * @return
	 */
	String code();
	
	/**
	 * 라벨(코드명)을 리턴.
	 * @return
	 */
	String label();
}
