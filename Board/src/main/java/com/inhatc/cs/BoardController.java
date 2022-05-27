package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
//	public String registerGET(BoardVO board, Model model) {
//		System.out.println("Register GET Called");
//		return "board/register";
//	}
	public void registerGET(BoardVO board, Model model) {
		System.out.println("Register GET Called");
//		return "board/register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void registerPOST(BoardVO board, Model model) throws Exception {
		System.out.println("Register POST Called");
		System.out.println("\n\n");
		System.out.println(board);
		service.create(board);
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		System.out.println("Read Called");
		System.out.println(service.read(bno));
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public void listAll(Model model) throws Exception {
//		Logger.info("show all list.............");
		model.addAttribute("list", service.listAll());
	}
	
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes cttr) throws Exception {
		service.delete(bno);
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modifyGET(int bno, Model model) throws Exception {
		model.addAttribute(service.read(bno));
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes cttr) throws Exception {
		service.modify(board);
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listCri", method=RequestMethod.GET)
	public void listCri(Criteria cri, Model model) throws Exception {
		System.out.println("listCri called");
		model.addAttribute("list", service.listCriteria(cri));
	}
}
