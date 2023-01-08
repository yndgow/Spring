package kr.co.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.store.service.CustomerService;
import kr.co.store.vo.CustomerVO;

@Controller
public class CustomerController {
		
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/list")
	public String customerList(Model m) {
		m.addAttribute("customers", service.selectCustomerVOs());
		return "/customer/list";
	}
	
	@GetMapping("/customer/register")
	public String customerRegister() {
		return "/customer/register";
	}
	@PostMapping("/customer/register")
	public String customerRegister(CustomerVO vo) {
		service.insertCustomerVO(vo);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/modify")
	public String customerModify(Model m, String custId) {
		m.addAttribute("customer", service.selectCustomerVO(custId));
		return "/customer/modify";
	}
	@PostMapping("/customer/modify")
	public String customerModify(CustomerVO vo) {
		service.updateCustomerVO(vo);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/delete")
	public String customerDelete(String custId) {
		service.deleteCustomerVO(custId);
		return "redirect:/customer/list";
	}

}
