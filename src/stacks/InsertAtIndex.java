package stacks;

import java.util.Stack;

public class InsertAtIndex {

	public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);  st.push(40);
		
		System.out.println("old stack");
		System.out.println(st);
		int insert = 2;
		
		int element = 65;
		
		Stack<Integer> st2 = new Stack<>();
		
		while(st.size() > insert)
		{
			st2.push(st.pop());
		}
		
		st.push(element);
		
		while(st2.size()> 0)
		{
			st.push(st2.pop());
		}
		
		System.out.println("new stack");
		
		System.out.println(st);
		
	}

}
