package kr.co.store.mapper;

import java.util.List;


import kr.co.store.vo.CustomerVO;

public interface CustomerMapper {
	
	List<CustomerVO> selectCustomerVOs();
	CustomerVO selectCustomerVO(String custId);
	void insertCustomerVO(CustomerVO vo);
	void updateCustomerVO(CustomerVO vo);
	void deleteCustomerVO(String custId);
	
}
