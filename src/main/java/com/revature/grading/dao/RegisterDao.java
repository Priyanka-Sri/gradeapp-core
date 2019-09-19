package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;
import com.revature.grading.util.ConnectionUtil;

public class RegisterDao {

	static Scanner sc = new Scanner(System.in);
	
	 public static Admindetails register(String sname,int regno, int eng, int mat, int com, int science, int social, int total, double avg,
			String grade) throws SQLException, ClassNotFoundException, DBException {

	// public static Admindetails register(Admindetails enterdetails) throws SQLException, ClassNotFoundException, DBException {
		
	Connection con = null;
		PreparedStatement pst = null;

		try {
			con = ConnectionUtil.getConnection();
String sql3="insert into student_details( STUDENTNAME,REGNO)values(?,?)";
			//String sql = "insert into StudentDb(SRNO,SName,ENG,MAT,COM,SCIENCE,SOCIAL,TOTAL,AVG,GRADE) values (?,?,?,?,?,?,?,?,?,?)";

			pst = con.prepareStatement(sql3);
			
			
			
		
			pst.setString(1, sname);
			
			pst.setInt(2, regno);
			
		/*	pst.setInt(3, eng);

			pst.setInt(4, mat);

			pst.setInt(5, com);
			pst.setInt(6, science);

			pst.setInt(7, social);

			pst.setInt(8, total);

			pst.setDouble(9, avg);

			pst.setString(10, grade);*/
			
			int rows = pst.executeUpdate();
			System.out.println("Number Of Rows Inserted    " + rows);
			
			//INSERTING INTO VALUES IN STUDENT TABLE AS WE REQUIRED
			
		//String sql1 = "insert into student(NAME,TOTAL,AVG,GRADE) values ( ?,?,?,?)";
			String sql1 = "insert into student_grade(REGNO,TOTAL,AVG,GRADE) values ( ?,?,?,?)";
			PreparedStatement pst1= con.prepareStatement(sql1);
			
			pst1.setInt(1, regno);
			pst1.setInt(2, total);

			pst1.setDouble(3, avg);

			pst1.setString(4, grade);
			
			int rows1 = pst1.executeUpdate();
			
			
				
			addMarks( regno,"ENG", "ENGLISH", eng);
			addMarks(regno, "MAT", "MATHEMATICS", mat);
			addMarks(regno, "COM", "COMPUTERS", com);
			addMarks(regno, "SCI", "SCIENCE", science);			
			addMarks(regno, "SOC", "SOCIAL", social);
			

		
			
			System.out.println("Number Of Rows Inserted    " + rows);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to register");
		}
		return null;

	}
	 
	 public static void addMarks(Integer regNo, String subId, String subName, Integer mark) throws SQLException {
			String sql2 = "insert into student_marks(REGNO,SUBID,SUBNAME,MARKS)"
					+ "VALUES(?,?,?,?)";
			
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement pst= con.prepareStatement(sql2);
			pst.setInt(1,regNo);
			pst.setString(2,subId);
			pst.setString(3,subName);
			pst.setInt(4, mark);
			
			int rows = pst.executeUpdate();
			System.out.println(subId + " Inserted " + rows);
			
	 }

	 

	
	

	public static void admin(String aname,String password, int mobileno, String role) throws SQLException, ClassNotFoundException, DBException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = ConnectionUtil.getConnection();

			//String sql = "insert into adminreg(NAME,PASSWORD,MOBILENO,ROLE) values (?, ?,?,?)";
			String sql = "insert into adminreg(NAME,PASSWORD,MOBILENO,ROLE) values (?, ?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, aname);
			pst.setString(2, password);

			pst.setInt(3, mobileno);

			pst.setString(4, role);

			
			// pst.executeUpdate();
			// System.out.println("\nRegistered Successfully. ");

			int rows = pst.executeUpdate();
			System.out.println("Number Of Rows Inserted    " + rows);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to register");
		}

	}
	
	
	public static void tech(String tname,String password, int mobileno, String role) throws SQLException, ClassNotFoundException, DBException {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = ConnectionUtil.getConnection();

			//String sql = "insert into adminreg(NAME,PASSWORD,MOBILENO,ROLE) values ( ?,?,?,?)";
			String sql = "insert into adminreg(NAME,PASSWORD,MOBILENO,ROLE) values ( ?,?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, tname);
			pst.setString(2,password);

			pst.setInt(3, mobileno);

			pst.setString(4, role);

			
			// pst.executeUpdate();
			// System.out.println("\nRegistered Successfully. ");

			int rows = pst.executeUpdate();
			System.out.println("Number Of Rows Inserted    " + rows);
		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to register");
		}

	}
	
	
	
	
	
	
	////////admin login ver////////////////////////
	
	
	
	
	
	public Admindetails ad1login(String name, String password) throws DBException {
		// TO DO Auto-generated method stub
		Connection con = null;
		con = ConnectionUtil.getConnection();
		PreparedStatement pst = null;
		Admindetails detail = null;

		try {
			String sql = "select NAME,PASSWORD,MOBILENO,ROLE from  adminreg where NAME=? and PASSWORD=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				String nAME = rs.getString("NAME");
				String pass = rs.getString("PASSWORD");
				Integer mobileno = rs.getInt("MOBILENO");
				String role = rs.getString("ROLE");
				
				detail = new Admindetails();

				detail.setNAME(nAME);
				detail.setPASSWORD(pass);
				detail.setMOBILENO(mobileno);
				detail.setROLE(role);
							}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to login");
		}
		return detail;
	}
	public Admindetails tech1login(String name, String password) throws DBException {
		// TO DO Auto-generated method stub
		Connection con = null;
		con = ConnectionUtil.getConnection();
		PreparedStatement pst = null;
		Admindetails detail = null;

		try {
			String sql = "select NAME,PASSWORD,MOBILENO,ROLE from  adminreg where NAME=? and PASSWORD=?";
			pst = con.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {

				String nAME = rs.getString("NAME");
				String pass = rs.getString("PASSWORD");
				Integer mobileno = rs.getInt("MOBILENO");
				String role = rs.getString("ROLE");
				
				detail = new Admindetails();

				detail.setNAME(nAME);
				detail.setPASSWORD(pass);
				detail.setMOBILENO(mobileno);
				detail.setROLE(role);
							}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException("Unable to login");
		}
		return detail;
	}











	




























	
	
	
	
	
	
	
}
