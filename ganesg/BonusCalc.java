package com.ganesg;

import java.util.Scanner;

public class BonusCalc {
	
	public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	
	  float salary=input.nextFloat(),Bonus = 0;
	  
	  if(32767<=salary) {
		  System.out.println("Too Large Number");
	  }
	  else if(salary<0) {
		  System.out.println("Invalid Input");
	  }
	  else {
		  Bonus=calcBasic(salary, Bonus);
		  int bonus=(int)Bonus;
		  System.out.println("Bonus For "+salary+" is = "+bonus);
	  }
	}

	public static float calcBasic(float salary,float Bonus) {

		   if(salary>20000) {
			  Bonus=17*salary/100+1500;
			  return Bonus;
		  }
		  else if(salary>15000 && salary<20000) {
			  Bonus=15*salary/100+1200;
			  return Bonus;
		  }
		  else if(salary>10000 && salary<15000) {
			  Bonus=12*salary/100+1000;
			  return Bonus;
		  }
		  else if(salary<10000) {
			  Bonus=8*salary/100+500;
			  return Bonus;
		  }
		return Bonus;
		
	}

}
