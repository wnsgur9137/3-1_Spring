package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.inhatc.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		System.out.println("MemberDAOImple : getTime()");
		return sqlSession.selectOne(NAMESPACE + ".getTime");
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(NAMESPACE + ".insertMember", vo);
	}
	
	@Override
	public MemberVO readMember(String userid) throws Exception {
		return (MemberVO)sqlSession.selectOne(NAMESPACE + ".selectMember", userid);
	}
	
	@Override
	public MemberVO readMemberWithPW(String userid, String userpw) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return (MemberVO)sqlSession.selectOne(NAMESPACE + ".selectMemberWithPW", paramMap);
	}
	
	@Override
	public void update(MemberVO vo) throws Exception {
		sqlSession.update(NAMESPACE + ".update", vo);
	}
	
	@Override
	public void delete(String userid) throws Exception {
		sqlSession.delete(NAMESPACE + ".delete", userid);
	}
	
	@Override
	public int listCount() throws Exception {
		return (int)sqlSession.selectOne(NAMESPACE + ".listCount");
	}
	
	@Override
	public List<MemberVO> listAll() throws Exception {
		return sqlSession.selectList(NAMESPACE+".listAll"); 
	}
}
