package stacks;

import java.util.*;



public class StacksBasics {

	public static void main(String[] args) {

		
		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);
		
		st.push(40);
		
		System.out.println(st);
		
		st.pop();
		
		System.out.println(st);
		
	System.out.println(st.peek());
	
	//to represent firrst element;
	
	while(st.size() > 1)
	{
	     
		st.pop();
		
	}
	System.out.println(st.peek());		
		
	
	st.pop();
	
	
	st.push(10);
	
	st.push(20);
	
	st.push(30);
	
	st.push(40);
	
	//second element
	System.out.println(st 	);
	while(st.size() > 2)
	{
	     
		st.pop();
		
	}
	
	System.out.println(st.peek());	
	
	
	}

}
