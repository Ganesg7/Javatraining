package com.ganesg;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] arr= new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			arr[j]=arr[j]*2;
			System.out.println("index at "+j+"  "+arr[j]);
		}

	}

}
