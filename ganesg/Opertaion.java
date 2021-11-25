
package com.ganesg;

public class Opertaion {

	public static void main(String [] args) {
		int a=12,b=15,e=-18;
		String text="Hello Peter";
		double c= Math.PI;
		System.out.println(c);
		double d=Math.E;
		System.out.println(d);
		System.out.println(Math.incrementExact(a));
		System.out.println(Math.decrementExact(b));
		System.out.println(Math.log10(c));
		System.out.println(Math.max(c, d));
		System.out.println(Math.pow(a, d));
		System.out.println(Math.negateExact(a));
		System.out.println(Math.rint(a));
		System.out.println(Math.signum(b));
		System.out.println(Math.getExponent(a));
		System.out.println(Math.absExact(b));
		System.out.println(Math.ceil(d));
		System.out.println(Math.sqrt(b));
		System.out.println(Math.ulp(a));
		System.out.println(Math.abs(-123));
		System.out.println(Math.negateExact(134));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
	}
}
