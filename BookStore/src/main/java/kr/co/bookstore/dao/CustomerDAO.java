package kr.co.bookstore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.vo.CustomerVO;

@Repository
public class CustomerDAO {

	@Autowired
	private SqlSessionTemplate mb;
	
	public List<CustomerVO> selectCustomers() {
		return mb.selectList("customer.selectCustomers");
	}
	public CustomerVO selectCustomer(String custId) {
		return mb.selectOne("customer.selectCustomer", custId);
	}
	public void insertCustomer(CustomerVO vo) {
		mb.insert("customer.insertCustomer", vo);
	}
	public void updateCustomer(CustomerVO vo) {
		mb.update("customer.updateCustomer", vo);
	}
	public void deleteCustoemr(String custId) {
		mb.delete("customer.deleteCustomer", custId);
	}
}
