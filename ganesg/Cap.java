package com.ganesg;

import java.util.Scanner;

public class Cap {
	public static void main(String [] args) {

		double km;
		int choice;
	    Scanner input=new Scanner(System.in);	
	    System.out.println("Enter How Much Distence need Travel in KM");
	    km=input.nextDouble();
	    
	    System.out.println("Choose Vichle Type");
		System.out.println("1.In Auto");
		System.out.println("2.In Bike");
		System.out.println("3.In Car");
		choice=input.nextInt();

		switch(choice) {
		case 1:
			System.out.println("Travel Charge is: "+50*km+" Rs");
			break;
		case 2:
			System.out.println("Travel Charge is: "+40*km+" Rs");
			break;
		case 3:
			System.out.println("Travel Charge is: "+80*km+" Rs");
			break;
			default:
				System.out.println("invalid Choice");
		}
	
	}
}