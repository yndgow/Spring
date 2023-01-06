package kr.co.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookstore.service.BookService;
import kr.co.bookstore.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	BookService service;
	
	@GetMapping("/book/list")
	public String bookList(Model m) {
		m.addAttribute("books", service.selectBooks());
		return "/book/list";
	}
	
	@GetMapping("/book/register")
	public String bookRegister() {
		return "/book/register";
	}
	@PostMapping("/book/register")
	public String bookRegister(BookVO vo) {
		service.insertBook(vo);
		return "redirect:/book/list";
	}
	
	@GetMapping("/book/modify")
	public String bookModify(String bookId, Model m) {
		m.addAttribute("book", service.selectBook(bookId));
		return "/book/modify";
	}
	@PostMapping("/book/modify")
	public String bookModify(BookVO vo) {
		service.updateBook(vo);
		return "redirect:/book/list";
	}
	
	@GetMapping("/book/delete")
	public String bookDelete(String bookId) {
		service.deleteBook(bookId);
		return "redirect:/book/list";
	}
}
