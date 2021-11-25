package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReorder {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter N number of an Index ");
		int index=input.nextInt();
		int[] arr1=new int[index];
		int[] arr2=new int[index];
		int[] arr3=new int[index];
		System.out.println("Enter The Value in Array");
		for(int i=0;i<index;i++) {
			arr1[i]=input.nextInt();	
		}
		System.out.println("Enter Reorder value to Change ");
		for(int i=0;i<index;i++) {
			arr2[i]=input.nextInt();
		}
		System.out.println(Arrays.toString(arr1));
		for(int i=0;i<index;i++) {
			System.out.println(i+" "+arr1[i]+"  "+arr2[i]);
			  int temp=arr2[i];
			  arr3[temp]=arr1[i];
		System.out.println(i+" "+arr1[i]+"index "+arr2[i]+" "+arr3[temp]);
		}
		System.out.println(Arrays.toString(arr3));
	}
	

}
