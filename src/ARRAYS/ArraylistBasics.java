package ARRAYS;

import java.util.Arrays;

import java.util.ArrayList;

public class ArraylistBasics {

	public static void main(String[] args) {

		int arr[]= {10,2,11,30,50};

		System.out.println("before sorting");
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
		
		
		Arrays.sort(arr);
		
		System.out.println("\nafter sorting");
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
		
		System.out.println("\nARRAY LISTTT");
		
		ArrayList<Integer> al=new ArrayList<>();
		
	    System.out.println(al+" size is "+al.size());
	    
	    al.add(0,20);
	    
	    System.out.println(al+" size is "+al.size());
	    
        al.add(1,30);
	    
	    System.out.println(al+" size is "+al.size());
		
        al.add(2,50);
	    
	    System.out.println(al+" size is "+al.size());
		
	    al.remove(2);
	    
	    System.out.println(al+" size is "+al.size());
		
	    
	    
	    System.out.println("array list traverse");
	    
	    for(int i=0;i<al.size();i++)
	    {
	    	System.out.println(al.get(i));
	    }
	    
	    al.add(2, 60);
	    
	    
	    System.out.println(al+" size is "+al.size());
		
        
	    al.set(2, 100);
	    
	    System.out.println(al+" size is "+al.size());
		
	    
	    al.clear();
	    
	    
	    System.out.println(al);
	    
	    
	}

}
