package com.ganesg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int number;
		boolean flag=false;
		Scanner input=new Scanner(System.in);
		number=input.nextInt();
		for(int i=2; i<number/2;i++) {
			if(number%i==0) {
				flag= true;
				break;
			}
		}
		if(!flag) {
			System.out.println(number+" its a Prime Number");
		}
		else {
			System.out.println(number+" NOT a Prime Number");
		}
	}
}
