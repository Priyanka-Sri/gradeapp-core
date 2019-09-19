package com.revature.grading.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.grading.model.Admindetails;

import com.revature.grading.services.UserOperations;
import com.revature.grading.util.ConnectionUtil;
import com.revature.grading.dao.RangeDao;
import com.revature.grading.dao.RegisterDao;

import com.revature.grading.dao.SubRankDao;

import com.revature.grading.dao.SubRankDaoImpl;
import com.revature.grading.dao.TOBDaoImpl;
import com.revature.grading.dao.TobDao;
import com.revature.grading.exception.DBException;

public class Login {

	static Scanner scn = new Scanner(System.in);

	// public static void main(String args[]) throws Exception {

public static void function() throws Exception {

		Login.WelcomePage();

	}

	public static void WelcomePage() throws Exception, ClassNotFoundException

	{

		System.out.println("\033[0;1m");// out put will come in bold font use this command

		// System.out.println("\033[0;4m");//FOR OUTPUT UNDER LINE USING THIS COMMAND

		System.out.println("                            @@@@@@ ADMIN AND TEACHER LOGIN  PAGE @@@@@");

		System.out.println("*******************************************");

		System.out.println("1.ADMIN LOGIN  OR   2.USER LOGIN OR 3.EXIT");

		System.out.println("******************************************");

		boolean quit = false;

		do {

			System.out.println("ENTER THE OPTION:");

			int menu = scn.nextInt();

			switch (menu)

			{

			case 1: {

				// adlogin verificsation and after process

				System.out.println("ADMIN NAME: ");
				String name = scn.next();

				System.out.println("PASSRORD: ");
				String password = scn.next();
				Admindetails det = new Admindetails();

				RegisterDao obj = new RegisterDao();

				det = obj.ad1login(name, password);

				if (det != null)

				{

					System.out.println("ADMIN  LOGIN SUCCESS");
					System.out.println("1.top to bottom");
					System.out.println("2.range");
					System.out.println("3.exit");

					boolean quite = false;

					do {
						System.out.println("ENTER THE choose :");

						int admenu = scn.nextInt();

						switch (admenu) {
						case 1:

							TobDao obj1 = new TOBDaoImpl();

							List<Admindetails> list = new ArrayList<Admindetails>();
							try {
								list = obj1.login();
								// detail = obj.login();
							} catch (DBException e) {

								e.printStackTrace();
							}
							System.out.println(" ");
							System.out.print("STUDENTNAME          ");
							System.out.print("REGNO        ");

							System.out.print("TOTAL    ");
							System.out.print("AVG     ");
							System.out.print("GRADE      ");

							System.out.println("      ");

							for (Admindetails admindetails : list) {
								// System.out.println(admindetails.getRegNo() +" "+ admindetails.getGrade()+"
								// "+admindetails.getENG() + " "+admindetails.getMAT()+" "+admindetails.getCOM()
								// +" "+admindetails.getScience() +" "+admindetails.getSocial() +" " +
								// admindetails.getSname());

								System.out.println(admindetails.getSname() + "                  "
										+ admindetails.getREGNO() + "           " + admindetails.getTotal() + "     "
										+ admindetails.getAvg() + "      " + admindetails.getGrade());

							}
							break;

						case 2: {
							//////////////////////////////////////////////////////////////////////////////

							// System.out.println("ENTER THE RANGE");

							System.out.print("ENTER THE MAXIMUN RANGE :");
							int max1 = scn.nextInt();

							System.out.print("ENTER THE MINIMUM RANGE :");
							int min1 = scn.nextInt();

							System.out.print("ENTER THE GRADE :");
							String grade1 = scn.next();

							System.out.println("  ");

//System.out.println("ENTER THE SECOND RANGE...????");

							System.out.print("ENTER THE MAXIMUN RANGE :");
							int max2 = scn.nextInt();

							System.out.print("ENTER THE MINIMUM RANGE :");
							int min2 = scn.nextInt();

							System.out.println("ENTER THE GRADE :");
							String grade2 = scn.next();
							System.out.println("       ");

//System.out.println("ENTER THE THIRD RANGE...????");

							System.out.print("ENTER THE MAXIMUN RANGE :");
							int max3 = scn.nextInt();

							System.out.print("ENTER THE MINIMUM RANGE :");
							int min3 = scn.nextInt();

							System.out.print("ENTER THE GRADE :");
							String grade3 = scn.next();
							System.out.println("     ");
//System.out.println("ENTER THE FOUTH RANGE...????");

							System.out.print("ENTER THE MAXIMUN RANGE :");
							int max4 = scn.nextInt();

							System.out.print("ENTER THE MINIMUM RANGE :");
							int min4 = scn.nextInt();
							System.out.print("     ");
							
							System.out.print("ENTER THE GRADE :");
							String grade4 = scn.next();
							System.out.println("     ");

							/*Connection con = ConnectionUtil.getConnection();

							String sql = "insert into rang(GRADE,MIN,MAX)VALUES(?,?,?),(?,?,?),(?,?,?),(?,?,?)";
							PreparedStatement pst3 = con.prepareStatement(sql);
							pst3 = con.prepareStatement(sql);

							pst3.setString(1, grade1);
							pst3.setInt(2, min1);
							pst3.setInt(3, max1);

							pst3.setString(4, grade2);
							pst3.setInt(5, min2);
							pst3.setInt(6, max2);

							pst3.setString(7, grade3);
							pst3.setInt(8, min3);
							pst3.setInt(9, max3);

							pst3.setString(10, grade4);
							pst3.setInt(11, min4);
							pst3.setInt(12, max4);

							int rows2 = pst3.executeUpdate();
							System.out.println("Number Of Rows Inserted    " + rows2);

							//*//////////////////////////////////////////////////////////////////

							
							RangeDao.Range( max1,  min1, grade1, max2,  min2, grade2, max3, 
									 min3, grade3, max4, min4, grade4);
							
							
							
						}

							break;

						case 3: {

							quite = true;

							break;

						}
						}

					} while (!quite);

				}

				else {
					throw new Exception("\n'INVALID ADMIN  NAME AND PASSWORD'");

				}

			}

				break;

			case 2: {

				// techlogin verificsation and after process

				System.out.println("TEACHER NAME: ");
				String name = scn.next();

				System.out.println("PASSRORD: ");
				String password = scn.next();
				Admindetails det = new Admindetails();

				RegisterDao obj = new RegisterDao();

				det = obj.tech1login(name, password);
				if (det != null) {

					System.out.println("TEACHER LOGIN SUCCESS");

					UserOperations userops = new UserOperations();

					userops.function();
				} else
					throw new Exception("\n'INVALID TEACHER NAME AND REGNO'");
				///////////////////

				break;
			}
			case 3:

				quit = true;

				break;

			}

		} while (!quit);
	}
}
