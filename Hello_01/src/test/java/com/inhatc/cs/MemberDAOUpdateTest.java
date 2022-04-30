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
public class MemberDAOUpdateTest {
	@Inject
	private MemberDAO dao;
	
	@Test
	public void testUpdateMember() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setUserid("testid");
		vo.setUserpw("updatepw");
		vo.setUsername("updatename");
		vo.setEmail("update@inhatc.co.kr");
		dao.update(vo);
	}
}
