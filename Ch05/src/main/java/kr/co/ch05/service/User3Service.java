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
}
