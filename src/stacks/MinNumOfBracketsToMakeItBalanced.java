package stacks;

import java.util.Stack;

public class MinNumOfBracketsToMakeItBalanced {

	
	public static int count(String str,Stack<Character> st)
	{
		int num = 0;
		
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i) == '(')
			{
				st.push('(');
			}
			
			if(str.charAt(i) == ')')
			{
//				if(st.size()==0) 
//					{
//					  st.push(')');
//					}
				if(st.size()!=0 && st.peek() == '(')
				st.pop();
				
				else
				{
					st.push(')');
				}
			}
			
		}
		
		num = st.size();
		
		
		return num;
	}
	public static void main(String[] args) {

        Stack<Character> st = new Stack<>();
		
		String str = "())))";
		
		System.out.println("min no of brackets to remove: "+count(str,st));
		
		
	}

}
