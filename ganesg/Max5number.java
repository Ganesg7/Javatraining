package com.ganesg;

import java.util.Scanner;

public class Max5number {
	public static void main(String[] args) {
		int n1,n2,n3,n4,n5;
		Scanner input=new Scanner(System.in);
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		n4=input.nextInt();
		n5=input.nextInt();
		
		if(n1>n2 && n1>n3 && n1>n4 && n1>n5) {
			System.out.println(n1+" Is Bigger Number");
		}
		else if( n2>n3 && n2>n3 && n2>n4 && n2>n5)
		{
			System.out.println(n2+" Is Bigger Number");
		}
		else if(n3>n4 && n3>n4 && n3>n5)
		{
			System.out.println(n3+" Is Bigger Number");
		}
		else if(n4>n5 )
		{
			System.out.println(n4+" Is Bigger Number");
		}
		else {
			System.out.println(n5+" Is Bigger");
		}
	}

}
