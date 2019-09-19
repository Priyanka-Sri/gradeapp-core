package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;
import com.revature.grading.model.SubjectWise;
import com.revature.grading.util.ConnectionUtil;

public class UserDaoImpl implements UserDao {

	public Admindetails login(String Sname, int regno) throws SQLException, DBException {
		Admindetails det = null;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = ConnectionUtil.getConnection();
			String sql = "select SName,REGNO,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE from  StudentDb where SName=? && REGNO=?";
			pst = con.prepareStatement(sql);

			pst.setString(1, Sname);
			pst.setInt(2, regno);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				String sname = rs.getString("SName");
				Integer regno1 = rs.getInt("REGNO");
				Integer eng = rs.getInt("ENG");
				Integer mat = rs.getInt("MAT");
				Integer com = rs.getInt("COM");
				Integer science = rs.getInt("Science");
				Integer social = rs.getInt("Social");
				Integer total = rs.getInt("Total");
				Double avg = rs.getDouble("Avg");
				String grade = rs.getString("Grade");

				det = new Admindetails();

				det.setSname(sname);
				det.setRegNo(regno1);
				det.setENG(eng);
				det.setMAT(mat);
				det.setCOM(com);
				det.setScience(science);
				det.setSocial(social);
				det.setTotal(total);
				det.setAvg(avg);
				det.setGrade(grade);

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to select");
		} finally {
			con.close();
			pst.close();
		}
		return det;

	}

	/// public void findBySubject(int menu) throws SQLException {
	public List<SubjectWise> findBySubject(String subjectId) throws SQLException {

		Connection con = ConnectionUtil.getConnection();
		List<SubjectWise> list = null;
		String sql1 = "	select sd.STUDENTNAME, sd.REGNO,  sg.REGNO as sg_regno,sg.GRADE,sm.MARKS,sm.SUBID,sm.SUBNAME FROM \n"
				+ "student_grade sg, student_details sd ,student_marks sm "
				+ "where sd.REGNO=sg.REGNO AND  sm.REGNO = sd.REGNO and sm.SUBID=?";

		System.out.println(sql1);

		PreparedStatement pst1 = con.prepareStatement(sql1);
		pst1.setString(1, subjectId);
		ResultSet rs = pst1.executeQuery();
		if (rs.next()) {
			SubjectWise sub = new SubjectWise();
			sub.setSUBID(subjectId);
			System.out.println("Subject");
			list = new ArrayList<SubjectWise>();
			System.out.println(" ");
			System.out.print("REGNO     ");
			System.out.print("GREDE     ");
			System.out.println("STUDENT NAME     ");
			System.out.println(" ");

			while (rs.next())

			{
				SubjectWise us = toRow(rs);

				list.add(us);

			}

		}
		return list;

		// return list;
	}

	private static SubjectWise toRow(ResultSet rs) throws SQLException {

		String grade = rs.getString("GRADE");
		String sname = rs.getString("STUDENTNAME");
		String sUBNAME = rs.getString("SUBNAME");
		int rEGNO = rs.getInt("REGNO");
	    String sUBID = rs.getString("SUBID");

		SubjectWise subject = new SubjectWise();
		subject.setGrade(grade);
		subject.setREGNO(rEGNO);
		subject.setSname(sname);
		subject.setSUBID(sUBID);
	    subject.setSUBNAME(sUBNAME);
		return subject;
	}

}
