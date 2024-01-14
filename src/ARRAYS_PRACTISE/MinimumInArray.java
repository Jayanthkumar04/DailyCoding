package ARRAYS_PRACTISE;

public class MinimumInArray {

	public static void main(String[] args) {
		
		int arr[]= {22,10,23,89,19};
		
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<ans)
			{
				ans=arr[i];
			}
		}
		
		System.out.println("min is "+ans);
	}

}
