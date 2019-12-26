package com.ddusi.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SverviceController {
	@GetMapping("/kakao")
	public String kakao() {
		return "kakao";
	}
	@GetMapping("/naver")
	public String naver() {
		return "naver";
	}
}
