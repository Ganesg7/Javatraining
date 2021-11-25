package com.ganesg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class IncrementOrder {

	public static void main(String[] args) {
		int n,sum=0;

		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int len = String.valueOf(n).length();
		Integer[] arr = new Integer[len];
		for (int i = 0; i <= len - 1; i++) {
			int rem = n % 10;
			arr[i] = rem;
			n = n / 10;
		}
		Arrays.sort(arr, Collections.reverseOrder());
		for (int j = 0; j <= len - 1; j++) {
			System.out.print(arr[j]);
		}
	}

}
