package com.ganesg;

import java.util.Scanner;

public class ArraySecondMax {

	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		int index=input.nextInt();
		
		int temp;
		if(index<0) {
			System.out.println("Invalid Input");
			System.exit(0);
			
		}
		
		else {
			int[] arr=new int[index];
		for(int i=0;i<index;i++) {
			arr[i]=input.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]>arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int i=0;i<index;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Anwser is "+arr[0]*arr[index-2]);
	}
}
}