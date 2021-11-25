package com.ganesg;

import java.util.Scanner;

public class Coupans {
	public static void main(String [] args){
		int number,rev=0;
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		

		
		if(number%2!=0) {
			System.out.println(0);
		}
		
		else if(number<=0) {
		System.out.println("Number Too Small");
		}
		else {
		int n=number;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		int  num=rev;
		while(num!=0) {		
			int rem=num%10;
			if(rem%2==0) {
			 	System.out.print(rem);
			}
			
			num=num/10;
		}
	}
	}
}
