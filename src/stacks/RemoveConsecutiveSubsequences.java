package stacks;

import java.util.*;
public class RemoveConsecutiveSubsequences {

	
	public static int[] removeSubsequences(int arr[])
	{
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(st.size() == 0 || st.peek()!=arr[i]) st.push(arr[i]);
			
			
			
			else if(arr[i] == st.peek())
				{
		
					if(i == arr.length-1 || arr[i] != arr[i+1]) st.pop();
					
					
				}
		
			
			
		}
		
		int ans[] =  new int[st.size()];
		
		
		int m = ans.length;
		
		for(int i=m-1;i>=0;i--)
		{
		     ans[i] = st.pop();
		}
		
		return ans;
	}
	public static void main(String[] args) {

		int arr[] = {1, 2, 2, 3, 10, 10, 4, 4, 4, 5, 7, 7, 2};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();
		
		
		int ans[]=removeSubsequences(arr);
		
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+"  ");
		}
		
		
	}

}
