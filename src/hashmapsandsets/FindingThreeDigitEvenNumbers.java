package hashmapsandsets;

import java.util.ArrayList;
import java.util.HashMap;

public class FindingThreeDigitEvenNumbers {

	public static void main(String[] args) {

		
		int arr[] = {2,2,2,8,8};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int ele:arr)
		{
			if(hm.containsKey(ele))
			{
		          int value = hm.get(ele);
		          
		          hm.put(ele,value+1);
			}
			else {
				hm.put(ele, 1);
			}
		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=100;i<=999;i++)
		{
			int x = i;
			int c=x%10;
			x=x/10;
			int b=x%10;
			x=x/10;
			int a=x%10;
			
			if(hm.containsKey(a)) {
				
				if(hm.containsKey(b))
				{
					if(hm.containsKey(c))
					{
						ans.add(i);
					}
				}
			}
			
			
		}
		
	}

}
