package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;
import com.revature.grading.util.ConnectionUtil;

public class TOBDaoImpl implements TobDao {

	// @SuppressWarnings("null")
	public List<Admindetails> login() throws SQLException, DBException {

		List<Admindetails> list;
		Connection con = null;
		// PreparedStatement pst=null; 
		try {
			con = ConnectionUtil.getConnection();
			//String sql = "select SName,REGNO,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE  from  StudentDb order by TOTAL desc";
			/////////////////////////////////////////
			 String sql = "select sd.STUDENTNAME, sd.REGNO,  sg.REGNO as sg_regno, sg.TOTAL, sg.AVG, sg.GRADE "
			 		+ "FROM student_grade sg, student_details sd where sd.REGNO=sg.REGNO; ";
			 
			 
			
			
			
			
			
			PreparedStatement pst = con.prepareStatement(sql);

			ResultSet rs1 = pst.executeQuery();
			list = new ArrayList<Admindetails>();

			// ResultSet rs1 = null; 
			while (rs1.next()) {

				Admindetails admindetails = new Admindetails();
				admindetails.setSname(rs1.getString("sd.STUDENTNAME"));
				admindetails.setRegNo(rs1.getInt("REGNO"));
				admindetails.setTotal(rs1.getInt("sg.TOTAL"));
				
				admindetails.setAvg(rs1.getDouble("sg.AVG"));
				
				admindetails.setGrade(rs1.getString("sg.GRADE"));
				/*
				 * admindetails.setENG(rs1.getInt("ENG"));
				 * admindetails.setMAT(rs1.getInt("MAT"));
				 * admindetails.setCOM(rs1.getInt("COM"));
				 * admindetails.setScience(rs1.getInt("SCIENCE"));
				 * admindetails.setSocial(rs1.getInt("SOCIAL"));
				 */
				
				
				admindetails.setSname(rs1.getString("STUDENTNAME"));
				list.add(admindetails);
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to select");

		}finally {
			con.close();
			
		}

		return list;

	}
}
