package com.ganesg;

import java.util.Scanner;

public class Gradesys {
	public static void main(String[] args) {
		int mark;
		Scanner input=new Scanner(System.in);
		
		mark=input.nextInt();
		
		if( mark<=100 && mark>=90) {
			System.out.println("Grade A");
		}
		else if(mark<=89 && mark>=80 ) {
			System.out.println("Grade B");
		}
		else if(mark<=79 && mark>=70) {
			System.out.println("Grade C");
		}
		else if(mark<=69 && mark>=60) {
			System.out.println("Grade D");
		}
		else if(mark<=59 && mark >=45) {
			System.out.println("Grade E");
		}
		else if(mark>=101 && mark<=0) {
			System.out.println("Invalid Mark Entered");
		}
		else if(mark>=0 && mark<=44){
			System.out.println("Grade F");
		}
		else {
			System.out.println("Invalid Mark Entered");
		}
	}

}
