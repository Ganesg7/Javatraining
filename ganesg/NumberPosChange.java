package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;

public class NumberPosChange {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();

		int index=0,num1=num,num2=0;
		while(num>0) {
			int rem=num%10;
			index+=1;
			num=num/10;
			
		}
	
		int arr1[]=new int[index];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=num1%10;
			num1=num1/10;
		}
		

		
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				
				if(arr1[i]<arr1[j]) {
					int temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(int i=0;i<arr1.length;i++) {
			int temp=arr1[i];
			num2=num2*10+temp;
		}
		System.out.println(num2);
	
	}
	

}
