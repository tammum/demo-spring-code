package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping("/index")
	public String showHome() {
		return "home";
	}
	
	@RequestMapping("/firstpage")
	public String showfirstPage() {
		return "firstpage";
	}
	@RequestMapping("/secondpage")
	public String showsecondPage() {
		return "secondpage";
	}
	@RequestMapping(value="/secondpage",method=RequestMethod.POST)
	public String redirectHomePage() {
		return "redirect:/index";
	}
}
