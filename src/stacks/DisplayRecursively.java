package stacks;

import java.util.Stack;

public class DisplayRecursively {

	public static void display(Stack<Integer> st)
	{
		
		if(st.size() == 0) return;
		
		int top = st.pop();
		
		
		display(st);
		
		System.out.print(top+"  ");
		st.push(top);
		
		
		
		
	}
	public static void main(String[] args) {

		
        Stack<Integer> st = new Stack<>();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);  st.push(40);

		
		display(st);
		
		System.out.println(st);
		
		
	}

}
