package com.ganesg;

import java.util.Scanner;

public class LoopsSample {

	public static void main(String[] args) {
		Integer[] arr= {12,33,726,236,236};
	
		Scanner input=new Scanner(System.in);
		
		int sum=0,result=0,total=0;
		for(int i=0;i<arr.length-1;i++) {
			sum+=arr[i];
		}
		int num=sum;
		System.out.println(sum);
		while(sum!=0) {
			int rem=sum%10;
			result=result+rem;
			sum=sum/10;
		}

	
		System.out.println(result);
		
		do {
			int remder=num%10;
			total+=remder;
			num=num/10;
		}while(num!=0);
		System.out.println(total);
	}

}
