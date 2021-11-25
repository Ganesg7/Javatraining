package com.ganesg;

import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int index=input.nextInt();
		int[] arr1=new int[index];
		int[] arr2=new int[index];
		for(int i=0;i<index;i++) {
			arr1[i]=input.nextInt();
			arr2[i]=input.nextInt();
		}
		for(int j=0;j<index;j++) {
			arr1[j]=arr1[j]-arr2[j];
			arr2[j]=arr1[j]+arr2[j];
			arr1[j]=arr2[j]-arr1[j];
		}
		for(int k=0;k<index;k++) {
			System.out.print( arr1[k]+"\t");

			System.out.println( arr2[k]);
		}
	}

}
