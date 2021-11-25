package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,11,21,31,41,51,61,7,122,23,24,53,36,8,2};
		int m=arr.length/2,index=-1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Value To Find in Array");
		int num=input.nextInt();
		Arrays.sort(arr);
		if(num==arr[m]) {
			index=m;
		}
		else if(num<arr[m]) {
			for(int i=0;i<m;i++) {
				if(num==arr[i]) {
					index=i;
				}
			}
		}
		else if(num>arr[m]) {
			for(int i=m+1;i<arr.length;i++) {
				if(num==arr[i]) {
					index=i;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		if(index>=0) {
			System.out.println("Number " +num+" Find at Index "+index);
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
//		
//		for(int i=0;i<arr.length;i++) {
//			if(num==arr[i]) {
//				index=i;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		if(index>=0) {
//			System.out.println("Number " +num+" Find at Index "+index);
//		}
//		else {
//			System.out.println("Invalid Input");
//		}

	}

}
