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
	
	@PostMapping("/user3/register")
	public String user3Register(User3VO vo) {
		service.insertUser3(vo);
		return "redirect:/user3";
	}
	
	@GetMapping("/user3/modify")
	public String user3Modify(String uid, Model m) {
		m.addAttribute("user", service.selectUser3(uid));
		return "/user3/modify";
	}
	
	@PostMapping("/user3/modify")
	public String user3Modify(User3VO vo, Model m) {
		service.updateUser3(vo);
		return "redirect:/user3";
	}
	
	@GetMapping("/user3/delete")
	public String user3Delete(String uid) {
		service.deleteUser3(uid);
		return "redirect:/user3";
	}
	
	
	
}
