package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;

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
	
}
