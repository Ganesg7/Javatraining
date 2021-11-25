package com.ganesg;

import java.util.Scanner;

public class MultiArray {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		int[][] res = new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Materix Value");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				arr1[i][j] = input.nextInt();
			}
		}

		System.out.println("Enter 2st Materix Value");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr2[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j] + "  ");
				System.out.print(" ");
				if (j == 2 && i == 1) {
					System.out.print("-");
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 0; j < arr2.length; j++) {
				System.out.print("  " + arr2[i][j]);
				System.out.print(" ");
				if (i == 1 && j == 2) {
					System.out.print("=");
				} else {
					System.out.print(" ");
				}
			}

			for (int j = 0; j < arr1.length; j++) {
				res[i][j] = arr1[i][j] - arr2[i][j];
				System.out.print("   " + res[i][j] + " ");
			}
			System.out.println();
		}
	}

}
