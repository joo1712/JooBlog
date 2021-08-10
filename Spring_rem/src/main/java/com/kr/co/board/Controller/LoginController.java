package com.kr.co.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@RequestMapping("/login.do")
		String index() {
			return "login";
	}
	
	@RequestMapping("/signUp.do")
		String signUp() {
			return "signUp";
	}
}
