package com.ganesg;

public class Reverse {

	public static void main(String[] args) {
		String name="Ganesh";
		String revName="";
		
		for(int i=name.length()-1;i>=0;i--) {
			if(i%2==0) {
				revName+=name.toUpperCase().charAt(i);
			}
			else {
			
				revName+=name.toLowerCase().charAt(i);
			}
			
					
		}
		System.out.println(revName);
	}
}
