package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	// Inject
	@Inject
	private SqlSession sqlSession;
	
	// Mapper
	private static final String namespace = "com.inhatc.mapper.BoardMapper";
	
	// INSERT
	@Override
	public void createBoard(BoardVO vo) {
		System.out.println("vo: "+vo);
		sqlSession.insert(namespace+".create", vo);
	}
	
	// SELECT
	@Override
	public BoardVO readBoard(Integer bno) throws Exception {
		return sqlSession.selectOne(namespace+".read", bno);
	}
	
	// UPDATE
	@Override
	public void updateBoard(BoardVO vo) throws Exception {
		sqlSession.update(namespace+".update", vo);
	}
	
	// DELETE
	@Override
	public void deleteBoard(Integer bno) throws Exception {
		sqlSession.delete(namespace+".delete", bno);
	}
	
	// LIST COUNT
	@Override
	public int listCount() throws Exception {
		return (int)sqlSession.selectOne(namespace+".listCount");
	}

	// LIST *
	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
		
	}
	
	// PAGING
	@Override
	public List<BoardVO> listPage(int page) throws Exception {
		if (page <= 0) {
			page = 1;
		}
		page = (page -1) * 10;
		return sqlSession.selectList(namespace + ".listPage", page);
	}
	
	// PAGE INPUT
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return sqlSession.selectList(namespace + ".listCriteria", cri);
	}
	
	// COUNT PAGE
	@Override
	public int countPaging(Criteria cri) throws Exception {
		return sqlSession.selectOne(namespace + ".countPaging", cri);
	}
	
}
