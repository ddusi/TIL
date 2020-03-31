package com.example.board.customer;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTemplateController {
	@GetMapping("/get")
	public Map<String, Object> getMap() {
		RestTemplate rt = new RestTemplate();
		Map<String, Object> map =
				rt.getForObject("http://ggoreb.com/m/exam.jsp", Map.class);
		return map;
	}
}