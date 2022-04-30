package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MemberVO;
import com.inhatc.persistence.MemberDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOListTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void listTest() throws Exception {
		System.out.println("데이터 수 : " + dao.listCount());
	}
	
	@Test
	public void listAllTest() throws Exception {
		System.out.println(dao.listAll());
	}
	
}
