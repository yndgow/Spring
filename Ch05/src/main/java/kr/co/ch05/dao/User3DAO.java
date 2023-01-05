package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User3VO;

@Repository
public class User3DAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<User3VO> selelctUser3s(){
		return mybatis.selectList("user3.selectUser3s");
	}
}
