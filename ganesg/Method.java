package com.ganesg;

public class Method {

	public static void main(String[] args) {
		myMethod("Ganesh", 24);
  		System.out.println(myMethod1(5, 2));
		int D = method2(1023, 2042);
		System.out.println(D);
		method("Ganesh",24);
		System.out.println(method(100,20980));
		System.out.println(method(12.38,78.8));
	}

    static double method(double d,double y) {
		double z=d+y;
		return z;
	}

	static int method(int i, int j) {

             int z=i+j;
		return z;
	}

	static void method(String name, int age) {
		if(age>18) {
			System.out.println("Name: "+name+" is Eligible For Voting");
		}
		else {
			System.out.println("Name: "+name+"NOT Eligible For Voting");
		}
		
	}

	static int method2(int i, int j) {
		int z = i + j;
		return z;
	}

	static int myMethod1(int i, int j) {
		int x = i + j;
		return x + 10;

	}

	static void myMethod(String name, int age) {
		System.out.println("My Name Is " + name + " and my age is " + age);

	}

}
