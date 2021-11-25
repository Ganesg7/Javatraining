package com.ganesg;

import java.util.stream.IntStream;

public class Print1to100 {

	public static void main(String[] args) {
		int one='A'/'A';
		String ten="..........";
		int len=ten.length();
		for(int i=one;i<=len*len;i++) {
			System.out.println(i);
		}
	
		IntStream.range(1, 101).forEach(e ->System.out.println(e));
	}
}
