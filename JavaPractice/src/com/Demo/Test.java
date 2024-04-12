package com.Demo;

public class Test {
 
	public static void main(String [] args) {
	
			try
			{
				String s = args[0];
				int x = Integer.parseInt(s);
//				System.out.println(args[0]);
				int a = 10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println("Plz Enter non zero value");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Plz Enter Input Value");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Plz Enter Number");
			}
			
			
	}
	
}
