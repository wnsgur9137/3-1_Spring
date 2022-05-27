package com.inhatc.service;

import java.util.List;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;

public interface BoardService {

	// INSERT
	public void create(BoardVO vo) throws Exception;
	
	// SELECT
	public BoardVO read(Integer bno) throws Exception;
	
	// UPDATE
	public void modify(BoardVO vo) throws Exception;
	
	// DELETE
	public void delete(Integer bno) throws Exception;
	
	// LIST ALL
	public List<BoardVO> listAll() throws Exception;
	
	// PAGE INPUT
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
		
	// COUNT PAGE
	public int countPaging(Criteria cri) throws Exception;
}
