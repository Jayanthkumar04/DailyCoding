package Searchingg;

public class LowerBound_Binary {

	public static int lowerbound(int arr[],int target)
	{

		int lb=arr.length;
		
		int low=0,high=arr.length-1;
		
		while(low <= high)
		{
			
			int mid=low+(high-low)/2;
			
			if(arr[mid] >= target)
			{
				lb=Math.min(lb,mid);
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		
		return lb;
	}
	
	
	public static void main(String[] args) {

		int arr[]= {10,20,30,30,40,50,60,70};
		
		
		int index = lowerbound(arr,80);
		
	
		System.out.println(index);
	}

}
