package com.ganesg;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Year :-");
		int year=input.nextInt();
		System.out.println(year+" Is a Leap Year...??");
		int n =checkLeapYear(year);
		if(n==1) {
			System.out.println("YES");
		}
		else if(n==0) {
			System.out.println("NO");
		}
		else if(n==-1) {
			System.out.println("invalid input");
		}

	}

	static int checkLeapYear(int year) {
		 if((year % 4 == 0) &&(year%100!=0) && (year%400!=0)) {
			 return 1;
		 }
		 else if(year<0) {
			 return -1;
		 }
		 else {
			 return 0;
		 }
		
		
	}
}
