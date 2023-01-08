package kr.co.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.store.mapper.CustomerMapper;
import kr.co.store.vo.CustomerVO;

@Service
public class CustomerService implements CustomerMapper{

	@Autowired
	private CustomerMapper mapper;
	
	@Override
	public List<CustomerVO> selectCustomerVOs() {
		return mapper.selectCustomerVOs();
	}

	@Override
	public CustomerVO selectCustomerVO(String custId) {
		return mapper.selectCustomerVO(custId);
	}

	@Override
	public void insertCustomerVO(CustomerVO vo) {
		mapper.insertCustomerVO(vo);
	}

	@Override
	public void updateCustomerVO(CustomerVO vo) {
		mapper.updateCustomerVO(vo);
		
	}

	@Override
	public void deleteCustomerVO(String custId) {
		mapper.deleteCustomerVO(custId);
	}

}
