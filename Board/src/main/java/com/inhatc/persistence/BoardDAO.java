package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;

public interface BoardDAO {
	
	// INSERT
	public void createBoard(BoardVO vo);
	
	// SELECT
	public BoardVO readBoard(Integer bno) throws Exception;
	
	// UPDATE
	public void updateBoard(BoardVO vo) throws Exception;
	
	// DELETE
	public void deleteBoard(Integer bno) throws Exception;
	
	// LIST COUNT
	public int listCount() throws Exception;

	// LIST *
	public List<BoardVO> listAll() throws Exception;
	
	// PAGING
	public List<BoardVO> listPage(int page) throws Exception;
	
	// PAGE INPUT
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	// COUNT PAGE
	public int countPaging(Criteria cri) throws Exception;
}
