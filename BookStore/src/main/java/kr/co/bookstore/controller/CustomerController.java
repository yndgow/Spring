package kr.co.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.bookstore.service.CustomerService;
import kr.co.bookstore.vo.CustomerVO;

@Controller
public class CustomerController {
	@Autowired
	CustomerService service;

	@GetMapping("/customer/list")
	public String CustomerList(Model m) {
		m.addAttribute("customers", service.selectCustomers());
		return "/customer/list";
	}
	
	@GetMapping("/customer/register")
	public String CustomerRegister() {
		return "/customer/register";
	}
	@PostMapping("/customer/register")
	public String CustomerRegister(CustomerVO vo) {
		service.insertCustomer(vo);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/modify")
	public String CustomerModify(String custId, Model m) {
		m.addAttribute("customer", service.selectCustomer(custId));
		return "/customer/modify";
	}
	@PostMapping("/customer/modify")
	public String CustomerModify(CustomerVO vo) {
		service.updateCustomer(vo);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/customer/delete")
	public String CustomerDelete(String custId) {
		service.deleteCustoemr(custId);
		return "redirect:/customer/list";
	}
}
