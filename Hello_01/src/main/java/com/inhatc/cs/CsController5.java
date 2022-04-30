package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CsController5 {
	
	@RequestMapping("doJSON")
	@ResponseBody
	public ProductVO doJSON() {
		ProductVO vo = new ProductVO("제품명 : ", 30000);
		System.out.println("doJSON 호출됨.");
		return vo;
	}

}
