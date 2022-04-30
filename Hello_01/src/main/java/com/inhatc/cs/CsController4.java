package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CsController4 {
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		System.out.println("doE 호출 /doF로 전환");
		rttr.addFlashAttribute("msg", "redirected");
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public String doF(String msg) {
		System.out.println("doF 호출됨." + msg);
		return "productList";
	}
}
