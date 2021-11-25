package com.ganesg;

import java.util.Scanner;

public class CircleProb {

	public static void main(String[] args) {
		int x1,x2,y1,y2,r1,r2;
		
		Scanner input=new Scanner(System.in);
		x1=input.nextInt();
		y1=input.nextInt();
		x2=input.nextInt();
		y2=input.nextInt();
		r1=input.nextInt();
		r2=input.nextInt();
		int de=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
		System.out.println(de);
		double d= Math.sqrt(de);
		System.out.printf("%.2f",d);
		System.out.println();
		double rad=r1+r2;
		
		if(d==rad) {
			System.out.println("Touchs");
		}
		else if(rad<d) {
			System.out.println("NOT Touchs");
		}
		else {
			System.out.println("Intersects");
		}
		

	}

}

 