package com.kr.co.board.Controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kr.co.board.Service.LoginService;

@Controller
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/login.do")
		public void selectUserLogin (HttpServletRequest request, Model model) {
			String userId = request.getParameter("userId");
			logger.info("여기들어왔다요~");
			try {
				if(userId != null && userId != "") {
					loginService.selectUserLogin(userId);
					model.addAttribute("yes", "통과");
				} else {
					model.addAttribute("no", "실패");
				}
				
			} catch(Exception e) {
				System.out.println("이게 먹히냐");
			}
	}
	
	@RequestMapping("/signUp.do")
		String signUp() {
			return "signUp";
	}
}
