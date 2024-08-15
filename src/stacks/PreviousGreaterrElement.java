package stacks;

import java.util.*;
public class PreviousGreaterrElement {

	public static int[] previousGreater(int arr[])
	{
		Stack<Integer> st = new Stack<>();
		
		int ans[] = new int[arr.length];
		
		ans[0] = -1;
		
		st.push(arr[0]);
		
		for(int i=1;i<arr.length;i++)
		{
			while(st.size() > 0 && st.peek()<arr[i])
			{
				st.pop();
			}
			if(st.size() == 0)
				{
				     
				ans[i]=-1;
				
				}
				else {
				
					ans[i] = st.peek();
			}
			
			
			st.push(arr[i]);
			
		}

		
		return ans;
	}
	public static void main(String[] args) {

//		int arr[] = {10,4,2,20,40,12,30};

		int arr[] = {10,20,30,40};
		for(int i:arr)
	    {
	    	System.out.print(i+"  ");
	    }
		System.out.println();
	    int ans[] = previousGreater(arr);
	    
	    for(int i:ans)
	    {
	    	System.out.print(i+"  ");
	    }
	}

}
