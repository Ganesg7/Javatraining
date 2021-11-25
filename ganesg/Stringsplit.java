package com.ganesg;

import java.util.Arrays;

public class Stringsplit {

	public static void main(String [] args) {
		String line="You Have Failed This City,May The Force Be With You,This Is The Way,83,Vatican Cameos,3.14";
		String [] data=line.split(",");
		System.out.println(Arrays.toString(data));
		String arrow=data[0];
		String starwars=data[1];
		String mando=data[2];
		String number=data[3];
		String sherl=data[4];
		String pi=data[5];
		
		System.out.println(arrow);
		System.out.println(starwars);
		System.out.println(mando);
		int num=Integer.valueOf(number);
		System.out.println(num);
		System.out.println(sherl);
		double pie= Double.valueOf(pi);
		System.out.println(pie);
	}
}
