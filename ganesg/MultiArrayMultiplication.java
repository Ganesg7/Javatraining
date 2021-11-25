package com.ganesg;

import java.util.Scanner;

public class MultiArrayMultiplication {
	public static void main(String [] args) {
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Materix Value");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = input.nextInt();
			}
		}

		System.out.println("Enter 2st Materix Value");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = input.nextInt();
			}
		}
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				c[i][j]=0;
				for(int k=0;k<c.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}


			}
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
			System.out.print(a[i][j]+" ");
			if(i==1 && j==2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			for(int j=0;j<c.length;j++) {
				System.out.print(" "+b[i][j]+" ");
				if(i==1 && j==2) {
					System.out.print("=");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<c.length;j++) {
				System.out.print(" "+c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
