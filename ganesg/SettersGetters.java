package com.ganesg;

import java.util.Scanner;

public class SettersGetters {

	public static void main(String [] args) {
		GettersSetters gs= new GettersSetters();
		gs.setMovieName("Star Wars");
		gs.setDialogue("May The Force Be With You");
	
		Scanner input=new Scanner(System.in);
		
		GettersSetters gs1=new GettersSetters();
		System.out.println("Enter The Movie Name");
		String mName=input.nextLine();
		gs1.setMovieName(mName);
		System.out.println("Enter Movies Dialogue");
		String mDialogue=input.nextLine();
		gs1.setDialogue(mDialogue);
		System.out.println("Movei Name:- "+gs.getMovieName());
		System.out.println("Famous Dialogue:- "+gs.getDialogue());
		System.out.println("Movie Name:- "+gs1.getMovieName());
		System.out.println("Famous Dialogue:- "+gs1.getDialogue());
	}
}
