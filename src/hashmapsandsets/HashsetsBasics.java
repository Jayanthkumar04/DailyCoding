package hashmapsandsets;

import java.util.HashSet;

public class HashsetsBasics {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		
		
		set.add(10);
		
		set.add(30);
		
		set.add(-1);
		
		set.add(90);
		
		set.add(-100);
		
		System.out.println("elements are "+set);
		
		System.out.println("size is "+set.size());
		
		set.remove(90);
		
		System.out.println("size is "+set.size());
		
		System.out.println(set.contains(90));
		
		System.out.println(set.contains(30));
		
		
		Object arr[] = set.toArray();
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
	}

}
