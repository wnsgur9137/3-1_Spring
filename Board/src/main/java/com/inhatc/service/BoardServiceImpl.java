package com.inhatc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.persistence.BoardDAO;

@Repository
public class BoardServiceImpl implements BoardService {
	
	@Inject
	BoardDAO dao;
	
	// INSERT
	@Override
	public void create(BoardVO vo) throws Exception {
		dao.createBoard(vo);
	}
	
	// SELETE
	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.readBoard(bno);
	}
	
	// UPDATE
	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.updateBoard(vo);
	}
	
	// DELETE
	@Override
	public void delete(Integer bno) throws Exception {
		dao.deleteBoard(bno);
	}
	
	// LIST ALL
	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}
	
	// PAGE INPUT
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}
	
	// COUNT PAGE
	@Override
	public int countPaging(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}
}
