package onlyPractise;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practisee {

	public static void main(String[] args) {

		HashMap<String,Integer> hm10 = new HashMap<>();
		
		String para = "hello jay how r u jay u u u u";
		
		String ans[] = para.split(" ");
		
		for(String i : ans)
		{
			if(hm10.containsKey(i))
			{
				hm10.put(i,hm10.get(i)+1);
			}
			
			else
			{
				hm10.put(i, 1);
			}
		}
		
		System.out.println(hm10);
		
		int mx = 0;
		
		String s = null;
		for(String i : hm10.keySet())
		{
			if(hm10.get(i) > mx)
			{
				mx = hm10.get(i);
			    s=i;
			}
			
		}
		
		System.out.println(s);
		
		
		Set ss = hm10.entrySet();
		
	    Iterator itr = ss.iterator();
		
	    
	    while(itr.hasNext())
	    {
	    	
	    	Map.Entry ent = (java.util.Map.Entry) itr.next();
	    	
	    	System.out.println(ent.getKey()+"       "+ent.getValue());
	    	
	    }
		
	}

}
