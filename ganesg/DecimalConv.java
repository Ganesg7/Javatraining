package com.ganesg;

import java.util.Scanner;

public class DecimalConv {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int binary = input.nextInt();
		String Length = String.valueOf(binary);
		int len = Length.length();
		if(len>4) {
			System.out.println("Invalied Input");
			System.exit(0);
		}
		int decimal = 0, rev = 0, m = 0;

		int n = binary;

		for (int i = 0; i <= len-1; i++) {
			m = n % 10;
			if(2<=m) {
				System.out.println("Invalied Input");
				System.exit(0);
			}
			decimal += m * Math.pow(2, i);
			n = n / 10;
		}
		System.out.println(decimal);

	}

}
