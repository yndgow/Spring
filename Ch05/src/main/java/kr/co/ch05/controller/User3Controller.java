package kr.co.ch05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User3Service;
import kr.co.ch05.vo.User3VO;

@Controller
public class User3Controller {
	
	@Autowired
	User3Service service;
	
	@GetMapping("/user3")
	public String user3List(Model model) {
		model.addAttribute("users", service.selectUser3s());
		return "/user3/list";
	}
	
	@GetMapping("/user3/register")
	public String user3Register() {
		return "/user3/register";
	}
	
	@PostMapping("/user3/reigser")
	public String user3Register(User3VO vo) {
		
		return "/user3/register";
	}
}
