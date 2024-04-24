package hdfc.loans.carloans;

import java.util.Date;

public class A 
{
	public static final int x = 100; 
	
	public void m1()
	{
		
		System.out.println("iam m1 from A");
	}
	
	public static void m4()
	{
		System.out.println("iam m1 from A");
	}
	
	static
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	static
	{
		System.out.println("Hi iam Static Block");
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		m4();
	}

}
