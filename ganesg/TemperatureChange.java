package com.ganesg;

import java.util.Scanner;

public class TemperatureChange {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double Fahrenhit=input.nextDouble();
		double Celsius = 0;
		
		if(Fahrenhit<0) {
			System.out.println("Invalid Output");
			System.exit(0);;
		}
		else {
			Celsius= (Fahrenhit-32)*5/9;
		}
		
		System.out.printf("%.2f",Celsius);
		
	}

}
