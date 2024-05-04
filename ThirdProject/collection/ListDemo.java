package collection;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("ravikanth");
		a.add(20);
		a.add(30);
		a.add(10);
		a.add(14.45f);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.contains("ravikanth"));
		System.out.println(a.get(3));
		System.out.println(a.indexOf("ravikanth"));
		a.add(50);
		System.out.println(a);
		a.add(1, "sai");
		System.out.println(a);
		a.set(1, "saiteja");
		System.out.println(a);
		System.out.println(a.subList(1, 6));
		a.remove(1);
		System.out.println(a);
		a.remove("ravikanth");
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}

}
