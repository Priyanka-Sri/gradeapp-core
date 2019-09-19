package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;
import com.revature.grading.util.ConnectionUtil;

public class RangeDao {

	public static void Range(int max1, int min1, String grade1, int max2, int min2, String grade2, int max3, int min3,
			String grade3, int max4, int min4, String grade4) throws SQLException, ClassNotFoundException, DBException {

		Range(grade1, min1, max1);	
		Range(grade2, min2, max2);	
		Range(grade3, min3, max3);	
		Range(grade4, min4, max4);	
	}
	
	public static void Range(String grade, int min, int max) throws SQLException, ClassNotFoundException, DBException {

		Connection con = null;
		PreparedStatement pst3 = null;

		try {
			con = ConnectionUtil.getConnection();
			String sql = "insert into rang(GRADE,MIN,MAX)VALUES(?,?,?)";
			pst3 = con.prepareStatement(sql);
			pst3 = con.prepareStatement(sql);

			pst3.setString(1, grade);
			pst3.setInt(2, min);
			pst3.setInt(3, max);
			int rows2 = pst3.executeUpdate();
			System.out.println("Number Of Rows Inserted    " + rows2);


		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to register");
		}
		// return null;
	}
	

}
