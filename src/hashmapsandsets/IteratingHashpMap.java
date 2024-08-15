package hashmapsandsets;

import java.util.HashMap;
import java.util.Map;

public class IteratingHashpMap {

	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<>();
		
		hm.put("jayanth",20);
		
		hm.put("harinivas",70);
		
		hm.put("krishna", 90);

	    for(String i:hm.keySet())
	    {
	    	System.out.println("key:"+i+" value:"+hm.get(i));
	    	
	    }
			System.out.println();
	    for(Object i:hm.entrySet())
	    {
	    	System.out.println(i);
	    }
	    
	    System.out.println();
	    
	    for(Map.Entry<String,Integer> entry:hm.entrySet())
	    {
	    	
	    	System.out.println(entry.getKey()+"   "+entry.getValue());
	    	
	    }
	
	}

}
