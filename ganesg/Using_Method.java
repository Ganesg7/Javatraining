package com.ganesg;

import java.util.Scanner;

public class Using_Method {

	public static void main(String [] args) {
		System.out.print(Math.pow(5,3));
		
      String original, reverse="";
      Scanner input=new Scanner(System.in);
      original=input.nextLine();
      
      for(int i=original.length()-1;i>=0;i--) {
    	  reverse=reverse+original.charAt(i);
    	  
      }
      System.out.println(reverse);
      
      if(original.equals(reverse)) {
    	  System.out.println(original+" is a palindrom");
      }
      else {
    	  System.out.println(original+" is NOT a palindrom");
      }
		
	}
}
