package com.ganesg;

import java.util.Scanner;

public class IndexUppercase {

	public static void main(String[] args) {
		String name;
		
		int index1;
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		index1=input.nextInt();
		
		char[] letter=name.toCharArray();
		letter[index1]=Character.toUpperCase(letter[index1]);
	
	System.out.println(String.valueOf(letter));

	}

}
