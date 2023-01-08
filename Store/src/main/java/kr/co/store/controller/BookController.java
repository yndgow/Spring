package kr.co.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.store.service.BookService;
import kr.co.store.vo.BookVO;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@GetMapping("/book/list")
	public String bookList(Model m) {
		m.addAttribute("books", service.selectBookVOs());
		return "/book/list";
	}
	
	@GetMapping("/book/register")
	public String bookRegister() {
		return "/book/register";
	}
	
	@PostMapping("/book/register")
	public String bookRegister(BookVO vo) {
		service.insertBookVO(vo);
		return "redirect:/book/list";
	}
	
	@GetMapping("/book/modify")
	public String bookModify(Model m, String bookId) {
		m.addAttribute("book", service.selectBookVO(bookId));
		return "/book/modify";
	}
	
	@PostMapping("/book/modify")
	public String bookModify(BookVO vo) {
		service.updateBookVO(vo);
		return "redirect:/book/list";
	}
	
	@GetMapping("/book/delete")
	public String bookDelete(String bookId) {
		service.deleteBookVO(bookId);
		return "redirect:/book/list";
	}
	
}
