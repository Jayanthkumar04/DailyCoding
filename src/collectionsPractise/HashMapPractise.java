package collectionsPractise;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractise {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<>();
		
//		1. Write a Java program to associate the specified value with the specified key in a HashMap.
		
		System.out.println("1. Write a Java program to associate the specified value with the specified key in a HashMap.");
		hm.put(1, "jay");
		
		hm.put(2, "harii");
		
		hm.put(3, "yashh");
		
		hm.put(4, "urva");
		
		for(Map.Entry ent:hm.entrySet())
		{
			
			System.out.println(ent.getKey()+"   "+ent.getValue());
			
		}
		
//		2. Write a Java program to count the number of key-value (size) mappings in a map.
		
		System.out.println("2. Write a Java program to count the number of key-value (size) mappings in a map.");
		System.out.println(hm.size());
		
//		3. Write a Java program to copy all mappings from the specified map to another map.
		
		System.out.println("3. Write a Java program to copy all mappings from the specified map to another map.");
	    
		HashMap<Integer,String> hm2 = new HashMap<>();
		
	    hm2.put(5, "windows");
	    hm2.put(6, "ubuntu");
	    
	    hm.putAll(hm2);
	    
	    System.out.println(hm);
	    
		
//	    4. Write a Java program to remove all mappings from a map.
	    
	    System.out.println("4. Write a Java program to remove all mappings from a map.");
	    
	    hm.clear();
	    
	    System.out.println(hm);
	    
//	    5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
	    
	    System.out.println("5. Write a Java program to check whether a map contains key-value mappings (empty) or not.");
	    
        hm.put(1, "jay");
		
		hm.put(2, "harii");
		
		hm.put(3, "yashh");
		
		hm.put(4, "urva");
	    
		System.out.println(hm);
		boolean b = hm.isEmpty();
		
		System.out.println(b);
		
		hm.clear();
		b=hm.isEmpty();
		System.out.println(b);
		
		
		String s="jayanth";
		
		
		for(Object i:hm.keySet())
		{
			
		}
		
		System.out.println("new hashmap");
		HashMap<Integer,String> hm0 = new HashMap<>();
		
		hm0.put(1, "parents");
		
		hm0.put(2, "sister");
		
		hm0.put(3, "god");
		
		hm0.put(4, "relatives");
		
		hm0.put(5, "friends");
		
		System.out.println(hm0);
		
		System.out.println(hm0.keySet());
		
		System.out.println(hm0.values());
		
		System.out.println(hm0.containsKey("god"));
		
		System.out.println(hm0.containsValue("god"));
		
	    System.out.println(hm0.entrySet());
	    
	    
	    for(Object i : hm0.keySet())
	    {
	    	System.out.println(i+"--->"+hm0.get(i));
	    }
	    System.out.println();
	    System.out.println();
	    for(Map.Entry<Integer, String> ent : hm0.entrySet())
	    {
	    	System.out.println(ent.getKey()+"------------->"+ent.getValue());
	    }
	    
	    
	    
	    
	}

}
