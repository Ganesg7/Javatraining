package com.ganesg;

import java.util.Scanner;

public class BoatDistance {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double Speed=input.nextInt();
		double waterSpeed=input.nextInt();
		double distance=input.nextInt();
		
		double perhour;
		
		perhour=distance/(Speed+waterSpeed);
		
		System.out.println(perhour);

	}

}
