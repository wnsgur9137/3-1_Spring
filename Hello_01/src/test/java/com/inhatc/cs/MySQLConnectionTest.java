package com.inhatc.cs;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest { // 127.0.0.1 ==> localhost
	
	private static final String DRIVER="com.mysql.cj.jdbc.Driver"; // 6.0 이하 버전은 com.mysql.jdbc.Driver
	private static final String URL="jdbc:mysql://127.0.0.1:3306/basicboard?"
			+ "serverTimezone=UTC&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
	private static final String USER="root";
	private static final String PW="inhatc202044021";
	
	@Test //Junit을 위한 지시자 - 테스트할 때만 사용.
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.print("con : ");
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
