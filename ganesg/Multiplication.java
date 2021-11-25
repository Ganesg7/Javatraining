package com.ganesg;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
	
		int num;
		Scanner input=new Scanner(System.in);
		
		num=input.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(i+" * "+num+" = "+num*i);
		}

	}

}
