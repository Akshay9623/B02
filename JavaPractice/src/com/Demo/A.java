package com.Demo;

public class A {
	//1) Simple Method
	//2) parameterized Method
	//3) Return type Method
	// Return type with Parameterized Method
	public void m1()                    // Simple Method
	{
		System.out.println("A----m1");
	}
	public void m2(int a, int b)                // parameterized Method
	{
		System.out.println(a+"  "+b);
	}
	public void m3(String d,String e)           //  parameterized Method
	{
		System.out.println(d+" "+e);
	}
	public int m4()								// Return type Method
	{
		int a =10;
		int b =20;
		int c=a*b;
		return c;
	}
	public static void main(String args[])
	{
	System.out.println("Welcome to Skills It Academy");
	A a = new A();
	  a.m1();
	  a.m2(3, 8);
	  a.m3("Hello", "Skills IT");
	  System.out.println(a.m4());
	}
}
