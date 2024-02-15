package Searchingg;

public class FirstAndLastOccurrenceOfElement {

	public static int[] firstAndLast(int arr[],int x)
	{
		int ans[]= {-1,-1};
		
		int low=0,high=arr.length-1;
		
		boolean flag = false;
		while(low <= high)
		{
			int mid = low+(high-low)/2;
			
			if(arr[mid] ==  x)
			{
				flag=true;
				break;
			}
			else if(arr[mid] > x)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		
		if(flag == true )
		{
			//finding lower bound
			
			int lb=arr.length;
			
			low=0;
			high=arr.length-1;
			
			while(low <= high)
			{

				int mid=low+(high-low)/2;
				
				if(arr[mid] >= x)
				{
					lb=Math.min(lb,mid);
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			
			ans[0] = lb;
			
			
	       low=0;high=arr.length-1;
			
	         int ub = arr.length;
			while(low <= high)
			{

				int mid=low+(high-low)/2;
				
				if(arr[mid] > x)
				{
					ub=Math.min(ub,mid);
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			
			ans[1]=ub-1;

		}
		
		
				
		return ans;
	}
	public static void main(String[] args) {
		
		int arr[]= {10,10,20,20,20,20,30,40,50,50,70,80};
		
		
		int ans[]=firstAndLast(arr,20);
		
		
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
		
	}

}
