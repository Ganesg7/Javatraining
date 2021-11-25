package com.ganesg;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args){
		int a,b,c,type;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Two Number");
		a=Integer.parseInt("40");
		
		b=Integer.parseInt("60");
		System.out.println("1.Add");
		System.out.println("2.Subraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divition");
		
		type=input.nextInt();
		
		switch(type) {
		case 1:
			System.out.println("Sum Of "+a+"+"+b+" is= "+(a+b));
			break;
		case 2:
			System.out.println("Sub of "+a+"-"+b+" is= "+(a-b));
			break;
		case 3:
			System.out.println("Multi of "+a+"*"+b+" is= "+(a*b));
			break;
		case 4:
			System.out.println("Divi of "+a+"/"+b+" is= "+(a/b));
			break;
		default:
			System.out.println("Invalid Opertion");
		
		}
		
	}

}
