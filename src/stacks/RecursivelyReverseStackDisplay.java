package stacks;

import java.util.Stack;

public class RecursivelyReverseStackDisplay {

	public static void displayReverse(Stack<Integer> st)
	{
		
		if(st.size() == 0) return;
		
		int top = st.pop();
		
		System.out.print(top+"  ");
		
		displayReverse(st);
		
		st.push(top);
		
		
		
		
	}

	public static void main(String[] args) {

		
        Stack<Integer> st = new Stack<>();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);  st.push(40);

		
		displayReverse(st);
		
		System.out.println(st);
	}

}
