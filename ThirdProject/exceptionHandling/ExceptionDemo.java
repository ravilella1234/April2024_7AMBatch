package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter the A value :");
			a = sc.nextInt();
			System.out.println("Enter the B value :");
			b = sc.nextInt();
			
			try 
			{
				c = a / b;
				System.out.println(c);
				break;
			} 
			catch (ArithmeticException e) 
			{
				e.printStackTrace();
			} 	
			finally 
			{
				System.out.println("iam final Block");
			}
		}
	}
}
