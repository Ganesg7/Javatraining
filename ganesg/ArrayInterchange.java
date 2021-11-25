package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInterchange {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Index Of An Array");
		int index=input.nextInt();
		int[] arr=new int[index];
		System.out.println("Enter The Values Of An Array");
		for(int i=0;i<index;i++) {
			arr[i]=input.nextInt();
		}
		

		interChange(arr,index);
	}

	static void interChange(int[] arr, int index) {


		for(int i=0;i<index/2;i++) {
			if(arr[i]==arr[index-1-i]) {
				
			}
			
			int temp=arr[i];
			arr[i]=arr[index-1-i];
			arr[index-1-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
