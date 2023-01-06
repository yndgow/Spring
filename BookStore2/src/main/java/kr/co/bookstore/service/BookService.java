package kr.co.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.bookstore.dao.BookDAO;
import kr.co.bookstore.vo.BookVO;

@Service
public class BookService {

	@Autowired
	private BookDAO dao;
	
	public List<BookVO> selectBooks(){
		return dao.selectBooks();
	}
	public BookVO selectBook(String bookId) {
		return dao.selectBook(bookId);
	}
	public void insertBook(BookVO vo) {
		dao.insertBook(vo);
	}
	
	public void updateBook(BookVO vo) {
		dao.updateBook(vo);
	}
	public void deleteBook(String bookId) {
		dao.deleteBook(bookId);
	}
}
