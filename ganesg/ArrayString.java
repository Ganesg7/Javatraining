package com.ganesg;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		String[] arr=new String[11];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			
				arr[i]=input.nextLine();
			
		}
		
		for(int j=0;j<arr.length;j++) {
			if(j%2==0) {
				System.out.println("index at "+j+"  "+arr[j]);
			}
		
		}
		System.out.println("\n");
		for(int k=0;k<arr.length;k++) {
			if(k%2!=0) {
				System.out.println("index at "+k+"  "+arr[k]);
			}
		}
	}
}
