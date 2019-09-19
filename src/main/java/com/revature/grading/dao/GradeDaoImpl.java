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

public class GradeDaoImpl implements GradeDao {

	public List<Admindetails> login(String grade1) throws SQLException, DBException {
		List<Admindetails> list=new ArrayList<Admindetails>();
		Connection con = null;
		PreparedStatement pst1 = null;
		try {
			con = ConnectionUtil.getConnection();

	//		String sql1 = "select SName,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE from  StudentDb where GRADE=?";
		
			
			
			
		/*	String sql1 = "select sd.STUDENTNAME, sd.REGNO,  sg.REGNO as sg_regno,sg.GRADE,sm.MARKS,sm.SUBID FROM 
student_grade sg, student_details sd ,student_marks sm
where sd.REGNO=sg.REGNO
and sm.SUBID='ENG'; ";
*/					
					
					
			 String sql1 = "select sd.STUDENTNAME, sd.REGNO,  sg.REGNO as sg_regno, sg.GRADE "
			 		+ "FROM student_grade sg, student_details sd where sd.REGNO=sg.REGNO and sg.GRADE=? ";
					
					
					
					
					
					
			
			
			pst1 = con.prepareStatement(sql1);

			pst1.setString(1, grade1);
			ResultSet rs1 = pst1.executeQuery();
			//list = new ArrayList<Admindetails>();

			while (rs1.next()) {
				/*Admindetails admindetails = new Admindetails();
				admindetails.setSname(rs1.getString("Sname"));
				admindetails.setGrade(rs1.getString("GRADE"));
				 
				admindetails.setENG(rs1.getInt("ENG"));
				admindetails.setMAT(rs1.getInt("MAT"));
				admindetails.setCOM(rs1.getInt("COM"));
				admindetails.setScience(rs1.getInt("SCIENCE"));
				admindetails.setSocial(rs1.getInt("SOCIAL"));
				
				list.add(admindetails);*/
				
				
				
				Admindetails admindetails = new Admindetails();
				admindetails.setSname(rs1.getString("sd.STUDENTNAME"));
				admindetails.setGrade(rs1.getString("sg.GRADE"));
				 
				admindetails.setREGNO(rs1.getInt("sd.REGNO"));
				//admindetails.setMAT(rs1.getInt("MARKS"));
				
				
				list.add(admindetails);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to select");
		}

		return list;
	}
}
