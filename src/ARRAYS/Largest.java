package ARRAYS;

public class Largest {

	public static int slarge(int arr[])
	{
		int first=flarge(arr);
		
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != first)
			{
				if(arr[i]>mx)
				{
					mx=arr[i];
				}
			}
		}
		return mx;
	}
	
	public static int flarge(int arr[])
	{
		int mx=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			mx=Math.max(mx, arr[i]);
		}
		
		return mx;
	}
	
	
	public static void main(String[] args) {

		int elements[]= {10,33,13,20,78};
		
		int firstLargest=flarge(elements);
		
		System.out.println("first larest "+firstLargest);
		
		
		int secondLargest=slarge(elements);
		System.out.println("second largest is "+secondLargest);
		
	}

}
