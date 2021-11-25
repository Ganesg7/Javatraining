package com.ganesg;

public class Fullname {
	static String fullname(String firstname, String lastname) {
		return firstname + " " + lastname;
	}

	public static void main(String[] args) {
		String firstname = "Luck";
		String lastname = "Skywalker";
		System.out.println(fullname(firstname, lastname));

	}


}
