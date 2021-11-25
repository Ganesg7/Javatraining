package com.ganesg;

import java.util.Scanner;

public class Vibgyor {
	
	public static void main(String [] args) {
		char color;
		Scanner input=new Scanner(System.in);
		color=input.next().toUpperCase().charAt(0);
		switch(color) {
		case 'V':
			System.out.println("Violte");
			break;
		case 'I':
			System.out.println("Indigo");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'R':
			System.out.println("Red");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}

			
	}

}
