package com.ganesg;

import java.util.Scanner;

public class ArrayTraingle {
	
	/*4
	  1 2 3 4
      8 5 9 6
      1 2 3 15
      5 7 1 6*/

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int index=input.nextInt();
		int[][] arr=new int[index][index];
		int priya = 0,vel=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j && i<j) {
					priya+=arr[i][j];
				}
				if(i!=j && i>j) {
					vel+=arr[i][j];
				}
			}
			
		}
		
		System.out.println(priya+" "+ vel);

	}

}
