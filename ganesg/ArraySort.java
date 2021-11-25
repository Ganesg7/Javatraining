package com.ganesg;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
	public static void main(String [] args) {
		Integer [] arr= {12,752,8827,828615,67256,663562,978286,12,13,32,43,34,43};
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
