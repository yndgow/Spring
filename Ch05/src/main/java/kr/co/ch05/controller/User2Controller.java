package kr.co.ch05.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ch05.service.User2Service;
import kr.co.ch05.vo.User2VO;

@Controller
public class User2Controller {
	
	@Autowired
	private User2Service service;
	
	@GetMapping("/user2")
	public String user2List(Model model) {
		model.addAttribute("users",service.selectUser2s());
		return "/user2/list";
	}
	
	@GetMapping("/user2/register")
	public String user2Register() {
		return "/user2/register";
	}
	
	@PostMapping("user2/register")
	public String user2Register(User2VO vo) {
		service.insertUser2(vo);
		return "redirect:/user2";
	}
	
	@GetMapping("/user2/modify")
	public String user2Modify(Model model, String uid) {
		model.addAttribute("user", service.selectUser2(uid));
		return "/user2/modify";
	}
	
	@PostMapping("user2/modify")
	public String user2Modify(User2VO vo) {
		service.updateUser2(vo);
		return "redirect:/user2";
	}
	
	@GetMapping("/user2/delete")
	public String user2Delete(String uid) {
		service.deleteUser2(uid);
		return "redirect:/user2";
	}
}
