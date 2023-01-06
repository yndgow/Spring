package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.CustomerDAO;
import kr.co.bookstore.vo.CustomerVO;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO dao;
	
	public List<CustomerVO> selectCustomers() {
		return dao.selectCustomers();
	}
	public CustomerVO selectCustomer(String custId) {
		return dao.selectCustomer(custId);
	}
	public void insertCustomer(CustomerVO vo) {
		dao.insertCustomer(vo);
	}
	public void updateCustomer(CustomerVO vo) {
		dao.updateCustomer(vo);
	}
	public void deleteCustoemr(String custId) {
		dao.deleteCustoemr(custId);
	}
}
