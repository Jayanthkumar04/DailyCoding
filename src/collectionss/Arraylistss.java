package collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistss {

	public static void main(String[] args) {

		//1
		String s[]= {"hello","jay","iam","alien"};
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(s));
		
		
		Iterator it = al.iterator();
		
		
		System.out.println(al);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		//2
		
		for(String ans : al)
		{
			System.out.println(ans);
		}
		
		
		
		
		//3
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(1);
		
		al2.add(4);
		al2.add(2);
		al2.add(11);
		
		Collections.sort(al2);
		
		System.out.println(al2);
		
		
		Collections.sort(al2,Collections.reverseOrder());
		
		System.out.println(al2);
		
		al2.removeAll(al2);
		System.out.println((al2));
	}

}
