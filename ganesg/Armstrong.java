package com.ganesg;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int oringinal, remnder, num , result = 0;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		oringinal = num;
		int length = String.valueOf(num).length();
		while (oringinal != 0) {
			remnder = oringinal % 10;
			result += Math.pow(remnder, length);
			oringinal /= 10;
		}
		System.out.println(result);
		if (num == result) {
			System.out.println(num+" It's A Armstrong");
		} else {
			System.out.println(num+"NOT A Armstrong");
		}
	}
}
