package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;

public class ArrraySortAndDelt {

	public static void main(String [] args) {
		
		int index;
		Scanner input=new Scanner(System.in);
		index=input.nextInt();
		int[] arr=new int[index];
		if(index<0) {
			System.out.println("Invalid input");
			System.exit(0);
		}
		else {
			for(int i=0;i<arr.length;i++) {
				arr[i]=input.nextInt();
				if(arr[i]<0) {
					System.out.println("Invalid input");
					System.exit(0);
				}
			}
			for(int j=0;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[j]>arr[k]) {
						int temp=arr[j];
						arr[j]=arr[k];
						arr[k]=temp;
					}
				}
			}
			System.out.println( Arrays.toString(arr));
			int num=input.nextInt();
			int index1=-1;
			for(int i=0;i<arr.length;i++) {
				if(num==arr[i]) {
				arr[i]=0;
				index1=i;
					break;
			   }
			}
			System.out.println(index1);
			
			for(int j=index1;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=0;
			System.out.println(Arrays.toString(arr));
			
		}
	}
}
