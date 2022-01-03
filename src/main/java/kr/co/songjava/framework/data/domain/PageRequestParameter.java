package kr.co.songjava.framework.data.domain;

import lombok.Data;


/**
 * @author ksme0
 * 페이지 요청 정보와 파라메터 정보.
 * @param <T>
 */
@Data
public class PageRequestParameter<T> {

	private MySQLPageRequest pageRequest;
	private T parameter;
	
	public PageRequestParameter(MySQLPageRequest pageRequest, T parameter) {
		this.pageRequest = pageRequest;
		this.parameter = parameter;
	}
}
