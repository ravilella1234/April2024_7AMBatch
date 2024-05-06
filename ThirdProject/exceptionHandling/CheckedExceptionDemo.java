package exceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo 
{
	
	public static void m1() throws FileNotFoundException
	{
		BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\ravi\\Desktop\\testdata1.xlsx"));
	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		m1();
	}

}
