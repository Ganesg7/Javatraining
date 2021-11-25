package com.ganesg;

import java.util.Scanner;

public class Patterns1 {
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int rows=input.nextInt();
		
		for(int i=1;i<=rows;i++) {
			int num=i;
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(num+" ");
				num=num+rows-j;
				
			}
			System.out.println();
		}
		input.close();
	}

}
