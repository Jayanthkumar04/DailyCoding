package hashmapsandsets;

import java.util.HashSet;

public class IteratingSet {

	public static void main(String[] args) {

		HashSet<Integer> set  = new HashSet<>();
		
		
		
		set.add(1);set.add(2);set.add(3);set.add(-10);
		
		
		
		System.out.println(set);
		
		
		
		System.out.println("elements before clear()");
		
		
		
		for(int ele:set)
		{
		
			System.out.print(ele+"  ");
		
		}
		
		
		
		System.out.println("\nelements after clear()");		
		
		
		
		set.clear();
		
	}

}
