package com.inhatc.domain;

public class Department202044021VO {
	private String departid;
	private String departname;
	private int students;
	private int yeonhan;
	
	public String getDepartid() {
		return departid;
	}
	public void setDepartid(String departid) {
		this.departid = departid;
	}
	public String getDepartname() {
		return departname;
	}
	public void setDepartname(String departname) {
		this.departname = departname;
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	public int getYeonhan() {
		return yeonhan;
	}
	public void setYeonhan(int yeonhan) {
		this.yeonhan = yeonhan;
	}
	
	
	@Override
	public String toString() {
		return "Department202044021VO [departid=" + departid + 
				", departname=" + departname + 
				", students=" + students
				+ ", yeonhan=" + yeonhan + "]";
	}
	
}
