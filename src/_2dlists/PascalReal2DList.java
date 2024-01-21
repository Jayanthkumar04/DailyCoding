package _2dlists;

import java.util.*;
public class PascalReal2DList {

	public static void main(String[] args) {

		
		List<List<Integer>> al=new ArrayList<>();
		
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			List<Integer> temp = new ArrayList<>();
			
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==j)
				{
					temp.add(1);
				}
				else
				{
					temp.add((al.get(i-1).get(j-1))+(al.get(i-1).get(j)));
				}
			}
			
			al.add(temp);
			
		}
		
		for(int i=0;i<n;i++)
		{
			
			List<Integer> temp = al.get(i);
			
			for(int j=0;j<temp.size();j++)
			{
				System.out.print(temp.get(j)+"   ");
			}
			
			System.out.println();
			
		}
		
		
	}

}
