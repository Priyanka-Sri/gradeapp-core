package com.revature.grading.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.revature.grading.model.Admindetails;
import com.revature.grading.util.ConnectionUtil;
import com.revature.grading.dao.GradeDaoImpl;
import com.revature.grading.dao.RegisterDao;
import com.revature.grading.dao.GradeDao;
import com.revature.grading.dao.TobDao;
import com.revature.grading.exception.DBException;
import com.revature.grading.dao.TOBDaoImpl;

public class UserOperations {

	static Scanner scn = new Scanner(System.in);
	static Admindetails det = new Admindetails();

	
	//public static void main(String args[])throws SQLException, ClassNotFoundException, DBException{
	public void function() throws SQLException, ClassNotFoundException, DBException {

		System.out.println();
		System.out.println("================");
		System.out.println("1.STUDENT INFORMATION ENTRY "); // top to bottom grade wise grade,name,roolnumber

		System.out.println("2.GRADE WISE"); // grade wise name,roolno

		System.out.println("3.SUBJECT WISE");// subject wise rank older sub,name,roolno,grade
		
		System.out.println("4.EXIT");
		
		System.out.println("==============");

		boolean quit = false;
		do {

			System.out.println("ENTER THE CHOICE :");
			int menu = scn.nextInt();

			switch (menu) {

			case 1: {
				

				System.out.println("=============================");

				System.out.println("ENTER THE STUDENT INFORMATION");

				System.out.println("=============================");

				System.out.println("Enter Student name:");

				String sname = scn.next();
				
				System.out.println("Enter STDENT REGNO:");

				int regno = scn.nextInt();

				

				System.out.println("Enter The Mark Of English:");

				int eng = scn.nextInt();

				System.out.println("Enter The Mark Of Mathematics:");

				int mat = scn.nextInt();

				System.out.println("Enter The Mark Of Computer:");

				int com = scn.nextInt();

				System.out.println("Enter The Mark Of Science:");

				int science = scn.nextInt();

				System.out.println("Enter The Mark Of Social:");

				int social = scn.nextInt();

				int total = eng + mat + com + science + social;

				double avg = (double) (total / 5);

				if (total < 500)// if total is above 500 it will go to else part

				{

					System.out.println("Total Marks:" + total);

					System.out.println("Average:" + avg);

					String grade=getgrade(total);
					System.out.println("Grade:" + grade);

						//RegisterDao.register(sname, regno, eng, mat, com, science, social, total, avg, grade);

					}

				
			else {

					System.out.println("'ENTER THE VAILD MARKS'");

				}

				break;

			}
	case 2:

			{
				// System.out.println("use enter specifi grade ");

				System.out.println("Enter the grade");

				String grade2 = scn.next();

				GradeDao obj = new GradeDaoImpl();

				List<Admindetails> list = new ArrayList<Admindetails>();

				try {
					list = obj.login(grade2);
				} catch (DBException e) {

					e.printStackTrace();
				}

				System.out.println();
				System.out.print("GRADE   ");

				
				
				
				
				System.out.print("REGNO    ");
				System.out.println("STUDENT NAME            ");
				System.out.println("            ");

				for (Admindetails admindetails : list) {
					System.out.println(admindetails.getGrade() + "     "+admindetails.getREGNO()+ "     "+
				admindetails.getSname());
			
				
				
				/*	System.out.println(admindetails.getGrade() + "        " + admindetails.getENG() + "        "
							+ admindetails.getMAT() + "     " + admindetails.getCOM() + "     "
							+ admindetails.getScience() + "     " + admindetails.getSocial() + "     "
							+ admindetails.getSname());*/
			
				
				
				}

				break;
			}
		case 3: {
				// System.out.println("use should see sub rank:");

				SubWiseRank.function();

				break;
			}
			case 4:

				quit = true;

				

			}
			
			
	
		} while (!quit);
	}
public static String getgrade(int total) {
String grade;

{

	if (total > 440 && total <= 500) {

		grade = "D";

	} else if (total > 380 && total <= 440) {

		grade = "A";

	} else if (total > 200 && total <= 380) {

		grade = "B";

	} else {

		grade = "F";

	}
	return grade;
}

}
}
