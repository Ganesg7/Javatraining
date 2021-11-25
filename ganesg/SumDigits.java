package com.ganesg;

import java.util.Scanner;

public class SumDigits {
	public static void main(String [] args) {
		int num,res=0,n;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		n=num;
		while(num!=0) {
			int rem=num%10;
			res+=rem;
			num=num/10;
		}
		
		System.out.println(n+" Sum OF Digits is  "+res);
	}

}
