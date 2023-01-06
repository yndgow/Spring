package kr.co.store.service;

import java.util.List;

import kr.co.store.vo.BookVO;

public interface BookService {

	List<BookVO> selectBookVOs();
	BookVO selectBookVO(String bookId);
	void insertBookVO(BookVO vo);
	void updateBookVO(BookVO vo);
	void deleteBookVO(String bookId);
}
