package com.ganesg;

import java.util.Scanner;

;

public class FibnoSeries {

	public static void main(String [] args) {
		int n1=0,n2=1,n3;
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		

		for(int i=1;i<=number;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}
