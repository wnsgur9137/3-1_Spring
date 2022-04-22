package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.Department202044021VO;

@Repository //DB에 CRUD 명령을 실행하게 만드는 인터페이스
public class Department202044021DAOImpl implements Department202044021DAO {
	// 컴퓨터정보과 3학년 A반 202044021 이준혁
	
	
	@Inject // SqlSession	
	private SqlSession sqlSession;
	
	// Mapper
	private static final String namespace = "com.inhatc.mapper.Department202044021Mapper";
	
	@Override // insert
	public void insertDepartment(Department202044021VO vo) {
		System.out.println("vo: " + vo);
		sqlSession.insert(namespace + ".insertDepartment", vo);
	}
	
	@Override // select * from tbl_202044021_department where departmentid=#{departmentid}
	public Department202044021VO readDepartment(String departmentid) throws Exception {
		System.out.println("departid: " + departmentid);
		return sqlSession.selectOne(namespace+".selectDepartment", departmentid);
	}
	
	@Override // update (PRIMARY KEY 제외 나머지 모두)
	public void update(Department202044021VO vo) throws Exception {
		sqlSession.update(namespace+".updateDepartment", vo);
	}
	
	@Override // List 데이터 목록 조회
	public List<Department202044021VO> listAll() throws Exception {
		return sqlSession.selectList(namespace+".listAll");
	}
	
	@Override // delete
	public void deleteDepartment(String departid) throws Exception {
		sqlSession.delete(namespace+".deleteDepartment", departid);
	}
	
	@Override // data 셋의 수 (count)
	public int listCount() throws Exception {
		return (int)sqlSession.selectOne(namespace+".listCount");
	}
	
}

