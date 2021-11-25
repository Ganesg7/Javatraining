package com.ganesg;

import java.util.Scanner;

public class MilesCalc {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Bikes Cubic capacity");
		int cc=input.nextInt();
		
		if(221<=cc) {
			System.out.println("Number too large");
		}
		else if(100<=cc && 125>=cc) {
			System.out.println("Your Bike MIleage Is 75");
		}
		else if(126<=cc && 135>=cc) {
			System.out.println("Your Bike MIleage Is 70");
		}
		else if(136<=cc && 150>=cc) {
			System.out.println("Your Bike MIleage Is 60");
		}
		else if(151<=cc && 200>=cc) {
			System.out.println("Your Bike MIleage Is 50");
		}
		else if(201<=cc && 220>=cc) {
			System.out.println("Your Bike MIleage Is 35");
		}
		else if(cc<100) {
			System.out.println("Number TOO SAMLL");
		}
		else if(cc<0) {
			System.out.println("Invalied Input");
		}
		
	}
}
