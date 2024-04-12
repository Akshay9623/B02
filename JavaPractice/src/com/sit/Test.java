package com.sit;
public class Test {

	public Test(int  i)
	{
		System.out.println("Test Constructor");
	}
	
	public static void main(String[] args) {
		A a = new A();
		Test t = new Test(10);
		
	}
}