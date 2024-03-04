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
		
	    
	}

}
