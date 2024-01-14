package ARRAYS_PRACTISE;

public class SecondLargest {

	public static void main(String[] args) {

		
		int arr[]= {4,10,20,33,60};
		
		int ans = secondLargest(arr);
		
		System.out.println("second largest element is "+ans);
		
	}
	
	public static int secondLargest(int arr[])
	{
		int mx=first(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == mx)
			{
				arr[i]=Integer.MIN_VALUE;
			}
		}
		
		int ans=first(arr);
		
		return ans;
	}
	
	public static int first(int arr[])
	{
		int mx=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>mx)
			{
				mx=arr[i];
			}
		}
		
		
		
		return mx;
	}

}
