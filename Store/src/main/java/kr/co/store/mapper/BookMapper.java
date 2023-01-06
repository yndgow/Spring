package kr.co.store.mapper;

import java.util.List;

import kr.co.store.vo.BookVO;

public interface BookMapper {
	
	List<BookVO> selectBookVOs();
	BookVO selectBookVO(String bookId);
	void insertBookVO(BookVO vo);
	void updateBookVO(BookVO vo);
	void deleteBookVO(String bookId);
}
