package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUserDefineObject 
{

	public static void main(String[] args) 
	{
		/*Emp e = new Emp(100, "kiran");
		System.out.println(e.getEno());
		System.out.println(e.getEname());*/
		
		
		Emp e1 = new Emp(1, "kiran1");
		Emp e2 = new Emp(2, "kiran2");
		Emp e3 = new Emp(3, "kiran3");
		Emp e4 = new Emp(4, "kiran4");
		
		/*e1.display();
		e2.display();
		e3.display();
		e4.display();*/
		
		HashMap<Integer, Emp> h = new HashMap<Integer, Emp>();
		h.put(e1.getEno(), e1);
		h.put(e2.getEno(), e2);
		h.put(e3.getEno(), e3);
		h.put(e4.getEno(), e4);
		
		
		Set<Entry<Integer, Emp>> entries = h.entrySet();
		for(Entry<Integer, Emp> e:entries)
		{
			System.out.println(e.getKey());
			Emp ee = e.getValue();
			ee.display();
		}
		
		//Alternative way to print using iterator
		Iterator<Integer> iterator = h.keySet().iterator();
		while(iterator.hasNext())
		{
			Emp ep = h.get(iterator.next());
			ep.display();
		}
		
	}

}
