package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class BoardDAOUpdateTest {
	
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testUpdateBoard() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setTitle("updateTitle1");
		vo.setContent("updateContent1");
		vo.setWriter("uupdateWriter1");
		dao.updateBoard(vo);
	}
}
