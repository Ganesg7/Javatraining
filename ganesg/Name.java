package com.ganesg;

import java.util.stream.IntStream;

public class Name {

	public static void main(String[] args) {
		String firstname="Obi-Wan";
		String lastname="Kenobi";
		
		String fullname=firstname+lastname;
		System.out.println(firstname.concat(lastname));
		
		System.out.println(firstname.toUpperCase()+" "+lastname.toUpperCase());
		
		System.out.println(firstname.trim());
		
		System.out.println(fullname.length());
		
		System.out.println(fullname.indexOf("a"));
		
		System.out.println(firstname.compareTo(lastname));
        
		IntStream.range(1,51).forEach(e -> System.out.println(e));
	}

}
