package com.ganesg;

import java.util.Scanner;

public class SumPrime {
	
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int len=input.nextInt();
		if(len<0) {
			System.out.println("invalid input");
			System.exit(0);
		}
		
		int [] arr=new int[len];
		
		for (int i=0;i<arr.length;i++) {
		
			arr[i]=input.nextInt();
			
			if(arr[i]<0) {
				System.out.println("invalid input");
				System.exit(len);
			}
		}
		int SumPrime=sumprime(arr,len);
		System.out.println("Sum of Prime number  "+SumPrime);
	}

	public static int sumprime(int[] arr, int len) {
      int sumprime=0;
      for(int i=0;i<arr.length;i++) {
    	  
    	 if( primeNumber(arr[i])){
    		 sumprime+=arr[i];
    	 }
      }
		
		return sumprime;
	}

	public static boolean primeNumber(int value) {
		
		for(int i=2;i<(value/2)+1;i++) {
			if(value % i==0) {
				return false;
			}		
		}
		return true;
	}
}