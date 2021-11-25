package com.ganesg;

public class MaxValue {
	public static void main(String [] args) {
		float num1=23782232.62f,num2=78238.726f,num3=72862.62f;
	    float max=(num1>num2)?(num1>num3)?num1:num3:(num2>num3)?num2:num3;
	    System.out.println("Max is"+max);
	    System.out.println((num1>num2 && num1>num3)?"Num1 Is Grater "+num1:(num2>num3)?"Num2 IS Grater "+num2:"Num3 Is Grater "+num3);
	  
	}

}
