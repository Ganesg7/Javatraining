package com.ganesg;

import java.util.Arrays;

public class MaxValueArray {
	public static void main(String[] args) {
		int[] arr={62,278,82763,141,6217};
		Arrays.sort(arr);
		System.out.println("Max Value "+arr[arr.length-1]);
		System.out.println("Min Value "+Math.min(arr[0], arr[1]));
	}

}
