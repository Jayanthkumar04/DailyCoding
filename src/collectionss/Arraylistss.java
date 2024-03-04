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
		
		ArrayList<Integer> al5 = new ArrayList<>();
		
		al5.add(1);al5.add(2);al5.add(3);
		
		System.out.println(al5);
		
		System.out.println("iterator");
		
		Iterator itr = al5.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		ArrayList<Integer> al6 = new ArrayList<>();
		
		//heterogenous data
		ArrayList al7 = new ArrayList<>();
		
		al7.add(90);al7.add("hello");
		
		System.out.println(al7);
		al6.add(99);al6.add(98);al6.add(97);
		
	System.out.println("looping");
	
	    for(Object o:al6)
	    {
	    	System.out.println(o);
	    }
	    
	  
		al5.addAll(al6);
		
		System.out.println("add all");
		
		System.out.println(al5);

		System.out.println("remove");
		
		al5.removeAll(al5);
		
		System.out.println(al5);
		
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
	
	
		ArrayList<Integer> al0 = new ArrayList<>();
		
		al0.add(001);al0.add(002);al0.add(003);
		
		System.out.println("converting al0 to arrray");
		
		Object ans[] = al0.toArray();
	
	     for(int i=0;i<ans.length;i++)
	     {
	    	 System.out.println(ans[i]);
	     }
	     
	     
	     
	     
		
		
		
	}

}
