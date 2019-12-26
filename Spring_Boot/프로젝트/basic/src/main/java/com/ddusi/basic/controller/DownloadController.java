package com.ddusi.basic.controller;

import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DownloadController {
	@GetMapping("/download")
	public ResponseEntity<Resource> download() throws Exception {
		File file = new File("C:\\Users\\student\\Downloads/AtomSetup-x64.exe");
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		return ResponseEntity.ok()
		//ok는 성공했을때 200값을 리턴해줌
				
				.header("content-disposition"
						, "filename=" + URLEncoder.encode(file.getName(), "utf-8"))
				// header 안에 이런 형식으로 써 넣으면 다운로드 실행하게끔 약속함.
				
				.contentLength(file.length())
				.contentType(MediaType.parseMediaType("application/octet-stream"))
				// 파일의 총용량을 알려줌. 없으면 다운로드시 총 용량을 모르는 상태로 다운로드함.
				.body(resource);
	}
}