package kr.co.store.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.store.mapper.BookMapper;
import kr.co.store.service.BookService;
import kr.co.store.vo.BookVO;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookMapper bookMapper;

	@Override
	public List<BookVO> selectBookVOs() {
		return bookMapper.selectBookVOs();
	}

	@Override
	public BookVO selectBookVO(String bookId) {
		return bookMapper.selectBookVO(bookId);
	}

	@Override
	public void insertBookVO(BookVO vo) {
		bookMapper.insertBookVO(vo);
	}

	@Override
	public void updateBookVO(BookVO vo) {
		bookMapper.updateBookVO(vo);
	}

	@Override
	public void deleteBookVO(String bookId) {
		bookMapper.deleteBookVO(bookId);
	}

}
