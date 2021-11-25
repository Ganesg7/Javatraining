package com.ganesg;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		int a,b;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("-----Before Swap----\n");
		System.out.println("a:- "+a);
		System.out.println("b:- "+b+"\n");
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("------After Swap----\n");
		System.out.println("a:- "+a);
		System.out.println("b:- "+b);

	}

}
