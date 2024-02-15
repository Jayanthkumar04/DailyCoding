package collectionss;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1,"jay");

		hm.put(2,"hari");
		hm.put(3,"pun");
		hm.put(4,"din");

		
		System.out.println(hm);
		
		
		System.out.println(hm.get(1));
		
		hm.remove(2);
		
		System.out.println(hm);
		
		
		System.out.println((hm.keySet()));

		System.out.println(hm.values());
		
		System.out.println(hm.isEmpty());
		
		System.out.println(hm.containsKey(1));
		
		System.out.println(hm.containsValue("jay"));
		
		for(Object k: hm.keySet())
		{
			System.out.println("roll is "+k+" name is "+hm.get(k));
			
		}
		
		System.out.println(hm.entrySet());
		
		
		
		for(Map.Entry entry:hm.entrySet())
		{
			
			System.out.println("roll "+entry.getKey()+" name "+entry.getValue());
			
		}
		
		
		Set s = hm.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			
			Map.Entry entry = (java.util.Map.Entry)itr.next();
			
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		System.out.println("-------------------------");
		
		HashMap<Integer,String> h = new HashMap<>();
		
		h.put(1,"jay");
		
		h.put(2, "yash");
		
		h.put(3, "hari");
		
		System.out.println(h);
		
		System.out.println(h.keySet());
		
		System.out.println(h.values());
		
		
		Set s2 = h.entrySet();
		
		Iterator itr2 = s2.iterator();
		
		
		while(itr2.hasNext())
		{
			
			Map.Entry en = (java.util.Map.Entry) itr2.next();
		
		 System.out.println(en.getKey()+"   "+en.getValue());
		
		}
		
		
		
	}

}
