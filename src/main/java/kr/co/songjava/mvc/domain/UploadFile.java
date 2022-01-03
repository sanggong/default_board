package kr.co.songjava.mvc.domain;

import lombok.Data;

@Data
public class UploadFile {
	
	private int uploadFileSeq;
	private String pathname;
	private String filename;
	private String originalFilename;
	private String size;
	private String contentType;
	private String resourcePathname;
}
