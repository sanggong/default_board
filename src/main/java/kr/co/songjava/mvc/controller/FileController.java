package kr.co.songjava.mvc.controller;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kr.co.songjava.configuration.GlobalConfig;
import kr.co.songjava.configuration.exception.BaseException;
import kr.co.songjava.configuration.http.BaseResponse;
import kr.co.songjava.configuration.http.BaseResponseCode;

@RestController
@RequestMapping("/file")
@Api(tags="파일 API")
public class FileController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private GlobalConfig config;
	
	@PostMapping("/save")
	@ApiOperation(value="업로드", notes="")
	public BaseResponse<Boolean> save(@RequestParam("uploadFile") MultipartFile multipartFile) {
		logger.debug("multipartFile : {}", multipartFile);
		if (multipartFile == null || multipartFile.isEmpty()) {
			throw new BaseException(BaseResponseCode.DATA_IS_NULL);
		}
		String uploadFilePath = config.getUploadFilePath();
		logger.debug("uploadFilePath : {}", uploadFilePath);
		String prefix = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".")+1, multipartFile.getOriginalFilename().length());
		String filename = UUID.randomUUID().toString() + "." + prefix;
		logger.info("filename : {}", filename);
		
		File folder = new File(uploadFilePath);
		// 폴더가 없으면 생성
		if (!folder.isDirectory()) {
			folder.mkdirs();
		}
		
		String pathname = uploadFilePath + filename;
		File dest = new File(pathname);
		try {
			multipartFile.transferTo(dest);
		} catch (IllegalStateException | IOException e) {
			logger.error("e", e);
		}
		
		return new BaseResponse<Boolean>(true);
	}
	

}
