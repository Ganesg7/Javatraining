package com.ganesg;

import java.util.Scanner;

/*
 
 */
public class ArrayTwoDiagonalSum {

	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		int index=input.nextInt();
		int[][] arr=new int[index][index];
		int diagonal1=0,diagonal2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					diagonal1+=arr[i][j];
				}
				 if(i+j==(index-1)) {
					diagonal2+=arr[i][j];
				}
			}
			
		
	}
		System.out.println(diagonal1);
		System.out.println(diagonal2);
		System.out.println(Math.abs(diagonal1-diagonal2));
	}
}
