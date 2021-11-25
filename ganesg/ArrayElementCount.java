package com.ganesg;

import java.util.Scanner;

public class ArrayElementCount {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int index=input.nextInt();
		if(index<0) {
			System.out.println("Invalied Input");
			System.exit(0);
		}
		int[] arr=new int[index];
		int num;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
			if(arr[i]<0) {
				System.out.println("Invalied Input");
				System.exit(0);
			}
		}
		num=input.nextInt();
		int count=finedElementCount(num,arr);
		if(count>0) {
		System.out.println(count);
		}
		else {
			System.out.println(num+" Element Is Not In The Arraya");
		}
		
	}

	private static int finedElementCount(int num, int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				count++;
			}
		}
		return count;


		
	}

}
