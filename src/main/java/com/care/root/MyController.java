package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/index")	// url ���� ���
	public String memberIndex(Model model) {
		System.out.println("index ����");
		model.addAttribute("index", "�⺻ ������ �Դϴ�");
		return "member/index";	// views ������ ���
	}
	
	@RequestMapping("/logout")
	public String logout(Model model) {
		System.out.println("logout ����");
		model.addAttribute("test", "�� �Դϴ�");
		return "member/logout";
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		System.out.println("login ����");
		
		ModelAndView model = new ModelAndView();

		model.addObject("abc", "�α��� ������ �Դϴ�");
		model.setViewName("member/login");
		
		return model;
	}
}
