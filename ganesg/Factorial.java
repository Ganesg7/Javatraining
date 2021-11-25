package com.ganesg;

import java.util.Scanner;

public class Factorial {

	public static void main(String [] args) {
		int fact=1,number;
		Scanner input=new Scanner(System.in);
	
		number=input.nextInt();
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial Of "+number+" :- "+fact);
	}
}
