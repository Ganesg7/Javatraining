package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		int number = 0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Index Of Arrays");
		int index=input.nextInt();
		double[] arr1=new double[index];
		double[] arr2=new double[index];
		System.out.println("Enter First Array Values");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=input.nextDouble();
		}
		System.out.println("Enter Second Array Values");
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=input.nextDouble();
		}
		
		Demo obj=new Demo();
		 number=obj.NonStaticSum(arr1,arr2,index);
		
		System.out.println(number);
		
	}

	 int NonStaticSum(double[] arr1, double[] arr2,int index) {
	
		 double Max1,Max2;
		 Arrays.sort(arr1);
		 Arrays.sort(arr2);
		Max1= arr1[index-1];
		Max2= arr2[index-1];
		System.out.println(Max1+" "+Max2);
		 int sum=(int) (Max1+Max2);
		return sum;
	}
}
