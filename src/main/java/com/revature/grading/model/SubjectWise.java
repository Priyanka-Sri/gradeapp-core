package com.revature.grading.model;

public class SubjectWise {
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public int getREGNO() {
		return REGNO;
	}
	public void setREGNO(int rEGNO) {
		REGNO = rEGNO;
	}
	public String getSUBID() {
		return SUBID;
	}
	public void setSUBID(String sUBID) {
		SUBID = sUBID;
	}
	public String getSUBNAME() {
		return SUBNAME;
	}
	public void setSUBNAME(String sUBNAME) {
		SUBNAME = sUBNAME;
	}
	private String Sname;
	private String Grade;
	private int REGNO;
	private String SUBID;
	private String SUBNAME;
//	@Override
//	public String toString() {
//		return "SubjectWise [Sname=" + Sname + ", Grade=" + Grade + ", REGNO=" + REGNO + ", SUBID=" + SUBID
//				+ ", SUBNAME=" + SUBNAME + "]";
	@Override
	public String toString() {
		return "SubjectWise [Sname=" + Sname + ", Grade=" + Grade + ", REGNO=" + REGNO + "]";
	}
	}
