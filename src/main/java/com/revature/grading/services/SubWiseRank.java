package com.revature.grading.services;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.grading.dao.UserDao;
import com.revature.grading.dao.UserDaoImpl;
import com.revature.grading.exception.DBException;

public class SubWiseRank {

	static Scanner scn = new Scanner(System.in);

	public static void function() throws SQLException, ClassNotFoundException, DBException {
		// TODO Auto-generated method stub

		System.out.println("*********");

		System.out.println("1.ENGLISH");

		System.out.println("2.MATHEMATICS");

		System.out.println("3.COMPUTER");

		System.out.println("4.SCIENCE");

		System.out.println("5.SOCIAL");

		System.out.println("*********");

		System.out.println("CHOOSE THE SUBJECT: ");
		int menu = scn.nextInt();

		UserDao obj = new UserDaoImpl();
		obj.findBySubject( );

		UserOperations user = new UserOperations();
		user.function();

	}

}
