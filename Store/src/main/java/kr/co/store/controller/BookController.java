package kr.co.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.store.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@GetMapping("/book/list")
	public String booList(Model m) {
		m.addAttribute("books", service.selectBookVOs());
		return "/book/list";
	}
}
