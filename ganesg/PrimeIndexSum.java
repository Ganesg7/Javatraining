package com.ganesg;

import java.util.Scanner;

public class PrimeIndexSum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int index=input.nextInt();
		int[] arr=new int[index];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
			if(arr[i]<0) {
				System.exit(0);
			}
		}
		

		System.out.println(primeIndex(index,arr));
		
	}

	 static int primeIndex(int index, int[] arr) {
		 int sum=0,count=0,count1=0,avg=0;
		 for(int i=2;i<index;i++) {
			 count=0;
			 for(int j=1;j<=i;j++) {
				 if(i%j==0) {
					 count++;
				 }
				 
			 }
			 if(count==2) {
				 sum=sum+arr[i-1];
				 count1++;
			 }
		 }
		 
		 avg=sum/count1;
		 System.out.println(count);
		return avg;
	}
}
