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
public class MemberDAOReadTest {
	
	@Inject
	private MemberDAO dao;
	
	@Test
	public void readMember() throws Exception {
		System.out.print("readMember : ");
		System.out.println(dao.readMember("testid2"));
	}
	
	@Test
	public void readMemberWithPW() throws Exception {
		System.out.print("WithPW : ");
		System.out.println(dao.readMemberWithPW("testid2", "testpw"));
	}
}
