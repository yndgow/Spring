package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.User3DAO;
import kr.co.ch05.vo.User3VO;

@Service
public class User3Service {
	
	@Autowired
	private User3DAO dao;
	
	public List<User3VO> selectUser3s(){
		return dao.selelctUser3s();
	}
	
	public User3VO selectUser3(String uid) {
		return dao.selectUser3(uid);
	}
	
	public void insertUser3(User3VO vo) {
		dao.insertUser3(vo);
	}
	
	public void updateUser3(User3VO vo) {
		dao.updateUser3(vo);
	}
	
	public void deleteUser3(String uid) {
		dao.deleteUser3(uid);
	}
}
