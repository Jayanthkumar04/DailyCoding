package ARRAYS_PRACTISE;

public class DuplicateElementns {

	public static int[] Duplicate(int arr[])
	{
		
		int freq[]=new int[10001];
		
		for(int i=0;i<arr.length;i++)
		{
			
			freq[arr[i]]++;
		}
		
	
		return freq;
		
		
	}
	
	public static void main(String[] args) {

		
		int arr[]= {10,2,22,59,2,10,100,100};
		
		int ans[]=Duplicate(arr);
		
		System.out.println("duplicate elements in array are:");
		
		for(int i=0 ;i<ans.length;i++)
		{
			
			if(ans[i] > 1)
			{
			System.out.print(i+"  ");
			
			}
			
//			System.out.print(ans[i]+"  ");
		}
		
		
	}

}
