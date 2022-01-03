package kr.co.songjava.mvc.parameter;

import java.util.List;

import kr.co.songjava.mvc.domain.BoardType;
import lombok.Data;

/**
 * @author ksme0
 * 게시물 검색 파라미터
 */
@Data
public class BoardSearchParameter {

	private String keyword;
	private BoardType boardType;
	private BoardType[] boardTypes;
	
	public BoardSearchParameter() {
	}
	
}