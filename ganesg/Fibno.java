package com.ganesg;

import java.util.Scanner;

public class Fibno {

	public static void main(String [] args) {
		int n1=0,n2=1,n3,number;
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2;i<=number;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
}
