package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;
import java.math.*;
public class TwoNumbers {

	public static void main(String[] args) {
		int a,b,x = 0,y = 0;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		System.out.print(a+" ");
		System.out.print(b+"\n");
		
		for(int i=1;i<a;i++) {
			for(int j=1;j<b ;j++) {
				if((i+j)==a && (i*j)==b) {
				y=i;
				x=j;
					
				}
				
			}
		}
		System.out.println(x+" "+ y);

	}

}
