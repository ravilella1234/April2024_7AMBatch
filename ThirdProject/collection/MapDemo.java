package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		//HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		//LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(100, 100);
		h.put(20, 200);
		h.put(90, 300);
		h.put(10, 400);
		h.put(5, 200);
		
		System.out.println(h);
		/*System.out.println(h.size());
		System.out.println(h.get(30));
		Set<Integer> keys = h.keySet();
		
		for(Integer key :keys)
		{
			System.out.println(key +" ---- "+h.get(key));
			
		}
		
		System.out.println(h.containsKey(50));
		System.out.println(h.containsValue(400));*/
	}

}
