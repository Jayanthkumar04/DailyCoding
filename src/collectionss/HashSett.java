package collectionss;

import java.util.HashSet;
import java.util.Iterator;

public class HashSett {

	public static void main(String[] args) {

		HashSet hs = new HashSet<>(100,(float)0.89);
		
		hs.add(10);hs.add(20);hs.add(30);hs.add(40);hs.add(50);
		
		
        System.out.println(hs);
        
        Iterator itr = hs.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
		
        
        System.out.println("using foreach");
        
        for(Object o:hs)
        {
        	System.out.println(o);
        }
		
		
		
	}

}
