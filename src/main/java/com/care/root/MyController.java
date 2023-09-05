package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/index")	// url 연결 경로
	public String memberIndex(Model model) {
		System.out.println("index 실행");
		model.addAttribute("index", "기본 페이지 입니다");
		return "member/index";	// views 폴더에 경로
	}
	
	@RequestMapping("/logout")
	public String logout(Model model) {
		System.out.println("logout 실행");
		model.addAttribute("test", "값 입니다");
		return "member/logout";
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("login 실행");
		
		ModelAndView model = new ModelAndView();

		model.addObject("abc", "로그인 페이지 입니다");
		model.setViewName("member/login");
		
		return model;
	}
}
