package collectionsPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractise {

	public static void main(String[] args) {

//		Write a Java program to create an array list, add some colors (strings) and print out the collection.
		
		ArrayList<String> l1 = new ArrayList<>();
		
		l1.add("blue");
		
		l1.add("red");
		
		l1.add("green");
		
		System.out.println("1)  question 1");
		System.out.println(l1);
		
//		Write a Java program to iterate through all elements in an array list.
		
		System.out.println("2)  Write a Java program to iterate through all elements in an array list.");
		
		Iterator itr1 = l1.iterator();
		
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());
	    }
	    
//	    Write a Java program to insert an element into the array list at the first position.
		
	    
	    System.out.println("3)  Write a Java program to insert an element into the array list at the first position.");
		
	    l1.add(0,"yellow");
	    
	    System.out.println(l1);
	    
//	    Write a Java program to retrieve an element (at a specified index) from a given array list.
		
	    System.out.println("4)  Write a Java program to retrieve an element (at a specified index) from a given array list.");
	    
	    
	    System.out.println(l1.get(3));
	    
//	    Write a Java program to update an array element by the given element.
	    
	    System.out.println("5) Write a Java program to update an array element by the given element.");
	    
	    l1.set(3, "pure black");
	    
	    System.out.println(l1);
	    
//	    6. Write a Java program to remove the third element from an array list.
	
	System.out.println("6. Write a Java program to remove the third element from an array list.");
	
	 l1.remove(3);
	
	 System.out.println(l1);
	 
//	 7. Write a Java program to search for an element in an array list.
	 
	 System.out.println("7. Write a Java program to search for an element in an array list.");
	
	 
	 System.out.println(l1.contains("blue"));
	 
//	 8. Write a Java program to sort a given array list.	 
	
	 System.out.println("8. Write a Java program to sort a given array list.");
	
	Collections.sort(l1);
	
	System.out.println(l1);
	
//	9. Write a Java program to copy one array list into another.
	
	System.out.println("9. Write a Java program to copy one array list into another.");
	ArrayList<String> l2 = new ArrayList<>();
	
	l2.add("one");l2.add("two");l2.add("three");
	
	l1.addAll(l2);
	
	System.out.println(l1);
	
	
//	10. Write a Java program to shuffle elements in an array list.
	
	System.out.println("10. Write a Java program to shuffle elements in an array list.");
	Collections.shuffle(l1);
	
	System.out.println(l1);
	
	Collections.sort(l1);
//	11. Write a Java program to reverse elements in an array list.
	System.out.println(l1);
System.out.println("11. Write a Java program to reverse elements in an array list.");
	
  Collections.reverse(l1);
  
  System.out.println(l1);

  
//  12. Write a Java program to extract a portion of an array list.
  
  System.out.println("12. Write a Java program to extract a portion of an array list.");
  
 
  System.out.println(l1.subList(0,3));
  
  
//  13. Write a Java program to compare two array lists.  
  
  System.out.println("13. Write a Java program to compare two array lists.");
  
  ArrayList<String> l3 = new ArrayList<>();
  
  l3.add("hello");l3.add("java");l3.add("world");l3.add("buddy");

  ArrayList<String> l4 = new ArrayList<>();
  
  l4.add("hello");l4.add("python");l4.add("world");
  
  ArrayList<String> l5 = new ArrayList<>();
  
  for(String str:l3)
  {
	  l5.add(l4.contains(str)?"yes":"no");  
  }
  
  System.out.println(l5);
  
  
//14 Write a Java program that swaps two elements in an array list.
  
  
  
	}

}
