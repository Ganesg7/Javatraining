package com.ganesg;

public class StaticExample {

	public static void main(String[] args) {

		AnotherStatic As = new AnotherStatic();
		AnotherStatic As1 = new AnotherStatic();
		AnotherExample AE1=new AnotherExample();
		As.a = 10;
		As1.a = 12;
		As.b = 20;
		As.c = As.a + As.b;
		System.out.println(As.c);
		As1.c=As1.a*As.b;
		System.out.println(As.c);
		
		System.out.println(As.num1);
		
	
		AE1.c=AE1.a+AE1.b;
		
		System.out.println(AE1.c);

	}

}
