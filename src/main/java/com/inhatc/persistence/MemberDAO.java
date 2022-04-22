package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.MemberVO;

public interface MemberDAO {

	// 시간 출력
	public String getTime();	
	
	// INSERT
	public void insertMember(MemberVO vo);
	
	// SELECT * FROM tbl_member WHERE userid = #{userid}
	public MemberVO readMember(String userid) throws Exception;
	
	// SELECT * FROM tbl_member WHERE userid = #{userid} AND userpw = #{userpw}
	public MemberVO readMemberWithPW(String userid, String userpw) throws Exception;
	
	// UPDATE tbl_member SET userpw=#{userpw}, username=#{username}, email=#{email} WHERE userid = #{userid}
	public void update(MemberVO vo) throws Exception;
	
	// DELETE FROM tbl_member WHERE = userid=#{userid}
	public void delete(String userid) throws Exception;
	
	// SELECT count(*) FROM tbl_member
	public int listCount() throws Exception;
	
	// SELECT userid, userpw, username, email, regdate, updatedate FROM tbl_member
	// 리스트로 전부 출력
	public List<MemberVO> listAll() throws Exception;
}
