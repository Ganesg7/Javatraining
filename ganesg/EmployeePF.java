package com.ganesg;

public class EmployeePF {
	public static void main(String [] args) {
		String Name="Ganesh";
		int salary=45000;
		

		pfCalcmonth(Name,salary);
		pfCalcforyear(Name,salary);
		pfCalcfor4year(Name,salary);
		pfCalcfor5year(Name,salary);

	}

	

	 static void pfCalcfor5year(String name,int salary) {
		int pf5year=  ((salary*12/100)*60);
		System.out.println( name+ " PF for a 4.10Year : "+pf5year);
	}

	 static void pfCalcfor4year(String name,int salary) {
		int pf4year=salary*12/100*48;
		System.out.println(name+" PF for a 3.5 Year : "+pf4year);
		
	}

	 static void pfCalcforyear(String name,int salary) {
		int pfyear=salary*12/100*12;
		System.out.println(name+" PF for a year     : "+pfyear);
		
	}

	 static void pfCalcmonth(String name,int salary) {
		int pf=salary*12/100;
		System.out.println(name+" PF for a Month    : "+pf);
		
	}
}
