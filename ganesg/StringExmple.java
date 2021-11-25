package com.ganesg;

public class StringExmple {

	public static void main(String[] args) {
		String s1="Obi-wan",s2="Kenobi";
	
		
		
		for(int i=0;i<s1.length();i++) {

			char s3=s1.charAt(i);
			System.out.print(s3+"\n");
		
			
		}

		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals(s2));
	}

}
