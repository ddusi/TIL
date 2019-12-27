package com.example.board.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SverviceController {
	@GetMapping("/information")
	public String information() {
		return "information";
	}
}
