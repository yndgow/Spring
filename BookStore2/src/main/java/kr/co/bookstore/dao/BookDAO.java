package kr.co.bookstore.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.bookstore.vo.BookVO;

@Repository
public class BookDAO {

	@Autowired
	private SqlSessionTemplate mb;
	
	public List<BookVO> selectBooks(){
		return mb.selectList("book.selectBooks");
	}
	public BookVO selectBook(String bookId) {
		return mb.selectOne("book.selectBook", bookId);
	}
	public void insertBook(BookVO vo) {
		mb.insert("book.insertBook", vo);
	}
	public void updateBook(BookVO vo) {
		mb.insert("book.updateBook", vo);
	}
	public void deleteBook(String bookId) {
		mb.delete("book.deleteBook", bookId);
	}
}
