package stacks;

import java.util.Stack;

public class CopyingByArray {

	public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);  st.push(40);

		
		int n = st.size();
		
		
		int arr[] = new int[n];
		
		for(int i=n-1;i>=0;i--)
		{
		
			arr[i] = st.pop();
			
		}
		
		System.out.println(st);
		for(int i=0;i<n-1;i++)
		{
		
			st.push(arr[i]);
		
		}
		
		
		System.out.println(st);
		
		
	}

}
