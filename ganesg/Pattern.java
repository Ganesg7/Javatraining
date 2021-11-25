package com.ganesg;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Number Rows");
		int rows=input.nextInt();
		int num=0;
		for(int i=1;i<=rows;i++) {			
			
			for(int j=1;j<=i;j++) {	
				System.out.print(j+num+" ");
				
			}
			System.out.println();
			num++;
		}
		input.close();
	}
}
