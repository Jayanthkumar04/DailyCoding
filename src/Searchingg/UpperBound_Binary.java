package Searchingg;

public class UpperBound_Binary {

	public static int upperBound(int arr[],int target)
	{

		int ub=arr.length;
		
		int low=0,high=arr.length-1;
		
		while(low <= high)
		{
			
			int mid=low+(high-low)/2;
			
			if(arr[mid] > target)
			{
				ub=Math.min(ub,mid);
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		
		return ub;
	}
	
	
	public static void main(String[] args) {

		int arr[]= {10,20,30,30,40,50,60,70};
		
		
		int index = upperBound(arr,55);
		
	
		System.out.println(index);
	}

}
