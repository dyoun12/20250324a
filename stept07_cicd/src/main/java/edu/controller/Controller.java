package edu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("get1")
	public String reqRes() {
		System.out.println("resRes() ***************");
		return "요청 응답 성공";
	}
}
