package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("oracle");
		a.add("ibm");
		a.add("oaktech");
		a.add("durga");
		
		System.out.println(a);
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(var.equals("durga"))
				val.set("AshokIT");
			else
				val.remove();
		}
		System.out.println(a);
	}

}
