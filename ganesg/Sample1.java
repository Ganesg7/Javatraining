package com.ganesg;

public class Sample1 {

	public static void main(String[] args) {
		int int1 = 102;
		double double1 = int1+120.097384174000;
		int int2 = (int) int1;
		float float1 = int1 + int2+12.0908f;
		short short1 = (short) float1;
		int int3 = (char) int1;
		char char1 = (char) int1;
		int int4 = char1;
		double double2=int4/4+91782.089890;
		short short2=(short) double2;
		byte byte4=(byte) char1; 
		short short3=1098;
		byte byte3=(byte) short3;
		System.out.println(byte3);
	
		System.out.println(byte4);
		System.out.println(int1);
		System.out.println(double1);
		System.out.println(int2);
		System.out.println(float1);
		System.out.println(short1);
		System.out.println(int3);
		System.out.println(char1);
		System.out.println(int4); 

		System.out.println(double2);
		System.out.println(short2);
		
	}

}
