package ARRAYS_PRACTISE;

public class GivenArrraySortedOrNot {

	public static void main(String[] args) {

		int arr[] = {10,20,90,40,50};
		
		boolean ans=check(arr);
		
		if(ans == true)
			System.out.println("given array is sorted");
		else
			System.out.println("given array is not sorted");
		
	}
	
	public static boolean check(int arr[])
	{
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				return false;
			}
			
		}
		
		return true;
		
	}

}
