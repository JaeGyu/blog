package me.jaegyu.blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/hello")
	public String hello(Model model) {
		model.addAttribute("name", "Spring blog grom jaegyu");
		return "hello";
	}
}
