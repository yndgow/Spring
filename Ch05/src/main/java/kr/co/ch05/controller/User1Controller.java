package kr.co.ch05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User1Service;
import kr.co.ch05.vo.User1VO;

@Controller
public class User1Controller {
	
	@Autowired
	private User1Service service;
	
	@GetMapping("/user1")
	public String user1List(Model model) {
		model.addAttribute("users",service.selectUser1s());
		return "/user1/list";
	}
	
	@GetMapping("/user1/register")
	public String user1Register() {
		return "/user1/register";
	}
	
	@PostMapping("user1/register")
	public String user1Register(User1VO vo) {
		service.insertUser1(vo);
		return "redirect:/user1";
	}
	
	@GetMapping("/user1/modify")
	public String user1Modify(Model model, String uid) {
		model.addAttribute("user", service.selectUser1(uid));
		return "/user1/modify";
	}
	
	@PostMapping("user1/modify")
	public String user1Modify(User1VO vo) {
		service.updateUser1(vo);
		return "redirect:/user1";
	}
	
	@GetMapping("/user1/delete")
	public String user1Delete(String uid) {
		service.deleteUser1(uid);
		return "redirect:/user1";
	}
}
