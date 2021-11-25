package com.ganesg;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMiniumsSum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int index=input.nextInt();
		int[] arr1=new int[index];
		int[] arr2=new int[index];
		int min1 = 0,min2 = 0,ind1 = 0,ind2=0;
		for(int i=0;i<index;i++) {
			arr1[i]=input.nextInt();	
		}
		for(int i=0;i<index;i++) {
			arr2[i]=input.nextInt();
		}
		for(int i=0;i<index;i++) {
			  if (arr1[ind1]>= arr1[i]){
			        min1 = arr1[i];
			        ind1 = i;
			        System.out.println("Index "+i+" array1 "+arr1[i]+" array index1 "+ind1+" min value "+min1);
			        }
			 
		}
	
		System.out.println("-------------------");
		for(int i=0;i<index;i++) {
			 if (arr2[ind2]>= arr2[i]){
			        min2 = arr2[i];
			        ind2 = i;
			        System.out.println("Index "+i+" array2 "+arr2[i]+" array index2 "+ind2+" min value "+min2);
			        }
			 
			
		}
	
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		if(ind1==ind2 && min1==min2) {
			for(int i=0;i<index;i++) {
				 if (arr2[ind2+1]>= arr2[i]){
				        min2 = arr2[i];
				        
				        }
			}
			System.out.println("Sum of Value "+(min1+min2));
		}else {
		System.out.println("Min Sum Value "+(min1+min2));
		}
	}

}
