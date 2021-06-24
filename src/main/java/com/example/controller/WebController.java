package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("web")
public class WebController {

	@RequestMapping("/w3c")
	public String w3cTemplate() {
		return "w3c/index";
	}
}
