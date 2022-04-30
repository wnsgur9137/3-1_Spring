package com.inhatc.persistence;

import java.util.List;
import com.inhatc.domain.Department202044021VO;

public interface Department202044021DAO {
	// 컴퓨터정보과 3학년 A반 202044021 이준혁
	
	// data insert
	public void insertDepartment(Department202044021VO vo);
	
	// select 검색조건 학과id
	public Department202044021VO readDepartment(String departmentid) throws Exception;
	
	// update (PRIMARY KEY를 제외한 모든 항목)
	public void update(Department202044021VO vo) throws Exception;
	
	// 데이터 목록 조회 (List)
	public List<Department202044021VO> listAll() throws Exception;
	
	// delete
	public void deleteDepartment(String departid) throws Exception;
	
	// data 셋의 수 (count)
	public int listCount() throws Exception;
}
