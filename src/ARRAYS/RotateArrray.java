package ARRAYS;

public class RotateArrray {

	public static int[] rotateUsingNew(int arr[],int k)
	{
		int n=arr.length;
		
		k=k%n;
		
		int j=0;
		
		int ans[]=new int[n];
		
		for(int i=n-k;i<n;i++)
		{
			
		ans[j]=arr[i];	
			
		j++;
		
		
		}

		for(int i=0;i<n-k;i++)
		{
			ans[j++]=arr[i];
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60,70};
		
		System.out.println("before rotate");
		
		for(int ans:arr)
		{
			System.out.print(ans+" ");
		}
		
		System.out.println("after rotate");
		
		int arr1[]=rotateUsingNew(arr,5);
		
		for(int ans:arr1)
		{
			System.out.print(ans+" ");
		}
		
	}

}
