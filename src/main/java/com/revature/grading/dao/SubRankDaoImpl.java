package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;
import com.revature.grading.util.ConnectionUtil;

public class SubRankDaoImpl implements SubRankDao {

	public Admindetails login(String name, int regno2) throws DBException {
		// TO DO Auto-generated method stub
		Connection con = null;
		con = ConnectionUtil.getConnection();
		PreparedStatement pst = null;
		Admindetails detail = null;

		try {
			String sql = "select SName,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE from  StudentDb where SName=? and REGNO=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2, regno2);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				String sname = rs.getString("SName");
				Integer regno = rs.getInt("REGNO");
				Integer eng = rs.getInt("ENG");
				Integer mat = rs.getInt("MAT");
				Integer com = rs.getInt("COM");
				Integer science = rs.getInt("Science");
				Integer social = rs.getInt("Social");
				Integer total = rs.getInt("Total");
				Double avg = rs.getDouble("Avg");
				String grade = rs.getString("Grade");

				detail = new Admindetails();

				detail.setSname(sname);
				detail.setRegNo(regno);
				detail.setENG(eng);
				detail.setMAT(mat);
				detail.setCOM(com);
				detail.setScience(science);
				detail.setSocial(social);
				detail.setTotal(total);
				detail.setAvg(avg);
				detail.setGrade(grade);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to login");
		}
		return detail;
	}

}
