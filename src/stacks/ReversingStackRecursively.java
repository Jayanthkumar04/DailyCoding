package stacks;

import java.util.Stack;

public class ReversingStackRecursively {

	public static void insertAtBottom(int top,Stack<Integer> st)
	{
		while(st.size()>1)
		{
			st.pop();
		}
		
		st.push(top);
	}
	public static void reverse(Stack<Integer> st)
	{
		if(st.size() == 0) return;
		
		int top = st.pop();
		
		reverse(st);
		
		insertAtBottom(top,st);
		
	}
	public static void main(String[] args) {


        Stack<Integer> st = new Stack<>();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);  st.push(40);
		
		reverse(st);
		
		
	}

}
