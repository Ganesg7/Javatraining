package com.ganesg;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		int tamil, eng, math, chem, phy;
		int avg;

		Scanner input = new Scanner(System.in);

		tamil = input.nextInt();
		eng = input.nextInt();
		math = input.nextInt();
		chem = input.nextInt();
		phy = input.nextInt();

		if(tamil<0 || tamil>100 || eng<0 || eng>100 || math<0 || math>100 || chem<0 || chem>100 || phy<0 || phy>100) {
			System.out.println("Invalid Option");
		}
		else {
		avg = (tamil + eng + math + chem + phy) / 5;

		System.out.println("Average is = " + avg + "%");
		GradeCalclate(avg);
		
		}

}
	private static void GradeCalclate(int avg) {
		if( avg<=99 || avg>=80) {
			System.out.println("First Grade University");
			
		}
		else if( avg <80 || avg>=60) {
			System.out.println("Second Grade University");
		}
		else if(avg<=60 || avg>=0) {
		
			System.out.println("Thired Grade Univercity");
		}
		else{
			
			System.out.println("Invalied Input");
		}
		
	}
}