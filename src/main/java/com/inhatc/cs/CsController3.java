package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.ProductVO;

@Controller
public class CsController3 {
	@RequestMapping("doD")
	public String doD(Model model) {
		ProductVO product = new ProductVO("computer", 100000);
		model.addAttribute(product);
		return "productDetail";
	}
}
