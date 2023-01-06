package kr.co.bookstore.mapper;

import java.util.List;

import kr.co.bookstore.vo.CustomerVO;

public interface CustomerMapper {

	List<CustomerVO> selectCustomers();
	
	CustomerVO selectCustomer(String custId);
	
	void insertCustomer(CustomerVO vo);
	
	void updateCustomer(CustomerVO vo);
	
	void deleteCustomer(String custId);
	
}
