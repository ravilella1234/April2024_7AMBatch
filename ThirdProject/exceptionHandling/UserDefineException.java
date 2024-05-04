package exceptionHandling;

import java.util.Scanner;

public class UserDefineException extends Exception
{
	

	public UserDefineException(String str) 
	{
		super(str);
	}

	
	public static void main(String[] args) 
	{
		String city;
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter the 10 character city name :");
			city = sc.nextLine();
			try 
			{
				if (city.length() != 10)
					throw new UserDefineException("City name should be 10 character string");
				else
					System.out.println(city);
				break;

			} 
			catch (UserDefineException e) 
			{
				e.printStackTrace();
			} 
		}
	}

}
