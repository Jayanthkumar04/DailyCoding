package hashmapsandsets;

import java.util.HashSet;

public class CountNoofDistinctIntegersAfterReverse {

	public static int reverse(int n)
	{
		int ans = 0;
		while(n != 0)
		{
			int rem = n%10;
			
			ans = ans*10+rem;
			
			n=n/10;
		}
		
		return ans;
	}
	public static void main(String[] args) {

		int arr[] = {1,13,24,31,46};
		
		HashSet<Integer> hs = new HashSet<>();
        
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
			
			hs.add(reverse(arr[i]));
		}
		
		System.out.println(hs.size());
		
	}

}
