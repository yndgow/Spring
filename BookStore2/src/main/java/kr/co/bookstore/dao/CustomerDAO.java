package kr.co.bookstore.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.mapper.CustomerMapper;
import kr.co.bookstore.vo.CustomerVO;

@Repository
public class CustomerDAO {

	@Autowired
	private CustomerMapper customerMapper;
	
	public List<CustomerVO> selectCustomers() {
		return customerMapper.selectCustomers();
	}
	public CustomerVO selectCustomer(String custId) {
		return customerMapper.selectCustomer(custId);
	}
	public void insertCustomer(CustomerVO vo) {
		customerMapper.insertCustomer(vo);
	}
	public void updateCustomer(CustomerVO vo) {
		customerMapper.updateCustomer(vo);
	}
	public void deleteCustoemr(String custId) {
		customerMapper.deleteCustomer(custId);
	}
}
