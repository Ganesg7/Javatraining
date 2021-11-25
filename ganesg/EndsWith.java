package com.ganesg;

import java.util.Scanner;

public class EndsWith {

	public static void main(String [] args) {
		Scanner input=new Scanner(System.in);
		int index,count = 0;
		index=input.nextInt();
		int[] arr=new int[index];
				
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			 if(arr[j]%10==3) {
				count++;
			 }
			
		}
		System.out.print(count);
	}
}
