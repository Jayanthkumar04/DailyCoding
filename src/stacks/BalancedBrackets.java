package stacks;

import java.util.*;


public class BalancedBrackets {

	public static boolean isBalanced(String str,Stack<Character>st)
	{
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i) == '(')
			{
				st.push('(');
			}
			
			if(str.charAt(i) == ')')
			{
				if(st.size()==0) 
					{
					return false;
					}
				if(st.peek() == '(')
				st.pop();
			}
			
		}
		
		if(st.isEmpty())
		{
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {

		
		Stack<Character> st = new Stack<>();
		
		String str = "()()(())";
		
		System.out.println(isBalanced(str,st));
		
		
		
		
		
	}

}
