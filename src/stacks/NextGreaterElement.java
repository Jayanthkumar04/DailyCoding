package stacks;

import java.util.*;
public class NextGreaterElement {

	public static int[] nextGreaterElement(int arr[])
	{
		int n = arr.length;
		
		int ans[] = new int[n];
		
		ans[n-1] = -1;
		
		Stack<Integer> st = new Stack<>();
		
		st.push(arr[n-1]);
		
		for(int i=n-2;i>=0;i--)
		{
			
			while(st.size()>0  && st.peek() < arr[i])
			{
				st.pop();
			}
			
			if(st.size() == 0) ans[i] = -1;
			
			else {
				
				ans[i] = st.peek();
				
			}
			
			st.push(arr[i]);
			
			
			
		}
		
		return ans;
	}
	public static void main(String[] args) {

		int arr[] = {1,3,1,8,6,3,4};
		
		for(int i:arr)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		
		
		int ans[] = nextGreaterElement(arr);
		
		for(int i:ans)
		{
			System.out.print(i+"  ");
		}
	}

}
