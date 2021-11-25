package com.ganesg;

import java.util.Scanner;

public class GraterNumber {

	public static void main(String[] args) {
		int Num1,Num2;
		
		Scanner input=new Scanner(System.in);
		Num1=input.nextInt();
		Num2=input.nextInt();
		
		if(Num1>Num2) {
			System.out.println(Num1+" Is Bigger Than "+Num2 );
		}
		else {
			System.out.println(Num2+" is Bigger Than "+Num1);
		}

	}

}
