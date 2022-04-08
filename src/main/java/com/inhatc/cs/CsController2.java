package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CsController2 {
	@RequestMapping("doC")
	public String doc(@ModelAttribute("msg") String msg) {
		System.out.println("doC Called");
		return "result";
	}

}
