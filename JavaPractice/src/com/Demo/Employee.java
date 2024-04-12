package com.Demo;

public class Employee {

	String name="XYZ";
	int id=101;
	double salary = 5000000;
	double pf , hra , pt , ta , da , gross_salary , net_salary;
	
	void display_info() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
	}
	
	double calculate_salary() {
		
		pf = salary*10/100;
		hra = salary*15/100;
		pt = salary*7/100;
		ta = salary*10/100;
		da = salary*15/100;
		return pf + hra + pt + ta + da;
	}
	
	double gross_salary() {
		gross_salary = salary+hra+pf+pt+da+ta;
		return gross_salary;
	}
	
	double net_salary() {
		
		display_info();
		double x = calculate_salary();
		double y =gross_salary();
		System.out.println(x);
		System.out.println(y);
		
		net_salary = gross_salary-(pf+pt);
		return net_salary;
	}
	
}
