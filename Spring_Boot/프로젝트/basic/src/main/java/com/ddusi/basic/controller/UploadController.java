package com.ddusi.basic.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ddusi.basic.model.FileInfo;

@Controller
public class UploadController {
	@GetMapping("/upload1")
	public String upload1() {
		return "upload1";
	}

	@PostMapping("/upload1")
	@ResponseBody
	public String upload1Post(MultipartHttpServletRequest mRequest) {
		String result = "";
		// MultipartHttpServletRequest라이브러리를 이용하여 데이터베이스에 변수형태로 저장.

		List<MultipartFile> mFiles = mRequest.getFiles("file");
		for (int i = 0; i < mFiles.size(); i++) {
			mFiles.get(i);
			// 이름은 하나지만 multi file로 여러가지 파일을 받았을때 해결해줌.

			MultipartFile mFile = mFiles.get(i);
			// 업로드 된 파일 정보 (mFile에 다 들어감)
			String oName = mFile.getOriginalFilename();
			// getOriginalFilename 업로드 받았을때 파일의 원래 이름을 끄집어내서 저장해
			result += oName + "\n";
			try {
				mFile.transferTo(new File("C:/dev/" + oName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				System.out.println("");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 지정 경로에 지정 파일명으로 저장
		}
		return result;
	}

	@GetMapping("/upload2")
	public String upload2() {
		return "upload2";
	}

	@PostMapping("/upload2")
	@ResponseBody
	public String upload2Post(@RequestParam("file") MultipartFile mFile) {
		String result = "";
		String oName = mFile.getOriginalFilename();
		result += oName + "\n";
		return result;
	}

	@GetMapping("/upload3")
	public String upload3() {
		return "upload3";
	}

	@PostMapping("/upload3")
	@ResponseBody
	public String upload3Post(@ModelAttribute FileInfo info) {
		String result = "";
		String oName = info.getFile().getOriginalFilename();
		result += oName + "\n";
		return result;
	}
}