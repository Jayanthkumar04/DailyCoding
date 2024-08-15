package hashmapsandsets;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		int arr[] = {2,5,9,4,1};
		int target = 10;
		
		int ans[] = {-1, -1};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int remaining = target - arr[i];
			
			if(hm.containsKey(remaining))
			{
		      ans[0]=i;
		      ans[1]=hm.get(remaining);
			}
			else
			{
				hm.put(arr[i],i);
			}
		}
		
		for(int i:ans) System.out.println(i);
		
		
		
	}

}
