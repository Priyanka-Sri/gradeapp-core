package com.revature.grading.ui;

import java.util.Scanner;

import com.revature.grading.dao.RegisterDao;

public class Registration
{

	public static void main(String[] args) throws Exception {
		
		System.out.println("\033[0;1m");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("1.ADMIN REGISTRATION ");
		System.out.println("2.TEACHER REGISTRATION ");
		System.out.println("3.ADMIN AND TEACHER LOGIN PAGE ");
		System.out.println("4.EXIT ");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		 Scanner scn = new Scanner(System.in);
		boolean quit = false;
		do {
			System.out.println("ENTER THE CHOICE:");
			int menu = scn.nextInt();

			switch (menu)

			{
case 1:
			{	
				System.out.println("REGISTER...!!!!!");
				System.out.println("ADMIN NAME: ");
				String name = scn.next();

				System.out.println("PASSRORD: ");
				String password = scn.next();
				
				
				
				
				System.out.println("MOBILENO: ");
				int mobileno = scn.nextInt();
				
				
				 
				String role="ADMIN";
				RegisterDao.admin( name,password, mobileno, role);
		
			
			
			break;
			}
			
case 2 :
	
	
{
	System.out.println("REGISTER...!!!!!");
	System.out.println("TEACHER NAME: ");
	String name = scn.next();
	System.out.println("PASSRORD: ");
	String password = scn.next();

	System.out.println("MOBILENO: ");
	int mobileno = scn.nextInt();
	String role="TEACHER";
	RegisterDao.tech( name,password, mobileno, role);
	
	break;
}

case 3:
	{
	
		System.out.println("admin and teacher login");

		Login.function();

break;

	}
			
case 4:



	quit = true;



	break;




			}
	
		}while(!quit);
		 
	
	
	
	
	}
	}
		 

