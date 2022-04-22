package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.Department202044021VO;
import com.inhatc.persistence.Department202044021DAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DepartmentDAOCountTest {
	// 컴퓨터정보과 3학년 A반 202044021 이준혀
	
	@Inject
	private Department202044021DAO dao;
				
	@Test
	public void testListCount() throws Exception {
		System.out.println("데이터 수: " + dao.listCount());
	}
	
}
