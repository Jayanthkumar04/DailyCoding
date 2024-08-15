package stacks;

import java.util.*;


public class CopyStacks {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);  st.push(40);
		
		System.out.println(st);
		Stack<Integer> st2 = new Stack<>();
		
		while(st.size() > 0)
		{
			st2.push(st.pop());
		}
		
		System.out.println(st2);
		
		Stack<Integer> st3 = new Stack<>();
		
		while(st2.size()>0)
		{
			st3.push(st2.pop());
				
		}
			
		System.out.println(st3);
	}

}
