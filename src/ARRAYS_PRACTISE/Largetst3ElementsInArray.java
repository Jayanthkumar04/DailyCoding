package ARRAYS_PRACTISE;


public class Largetst3ElementsInArray {

	public static void main(String[] args) {

		int arr[] = {10,16,19,25,60,12};
		
		int ans[]=largestThree(arr);
		
		System.out.println("THE LARGEST 3 ELEMENTS ARE:");
		for(int i=0;i<3;i++)
		{
			System.out.print(ans[i]+"   ");
		}
		
	}

	
	public static int[] largestThree(int arr[])
	{
		
		int ans[] = new int[3];
		
		if(arr.length ==3)
		{
			for(int i=0;i<arr.length;i++)
			{
				ans[i]=arr[i];
			}
			
		}
		else
		{
			
		for(int i=0;i<3;i++)
		{
		
			ans[i]=max(arr);
			
			
			for(int j=0;j<arr.length;j++)
			{
				if(ans[i] == arr[j])
				{
					arr[j] = Integer.MIN_VALUE; 
				}
			}
			
		}
		}
		
		return ans;
	}
	
	public static int max(int arr[])
	{
		int mx=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > mx)
				mx=arr[i];
		}
		
		
		return mx;
	}
	
}
