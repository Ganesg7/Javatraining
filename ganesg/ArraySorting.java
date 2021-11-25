package com.ganesg;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String [] args) {
		int[] arr=new int[] {1,53,33,23};
		int temp=0;
		
		System.out.println("Elements of original array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]>arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("Elements of array sorted in asending order: ");
		for(int l=0;l<arr.length;l++) {
			System.out.println(arr[l]+" ");
		}
		
		
	}
}
