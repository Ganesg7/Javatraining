package com.ganesg;

import java.util.Scanner;

public class ArrayDuplicat {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter N number of an Index ");
		int index=input.nextInt();
		int num=0;
		String res="";
		int[] arr1=new int[index];
	
		System.out.println("Enter The Value in Array");
		for(int i=0;i<index;i++) {
			arr1[i]=input.nextInt();	
		}
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					num++;
				}
			}
		}
		System.out.println("Number Of dublicate"+num);
	}

}
