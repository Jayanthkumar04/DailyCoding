package ARRAYS_PRACTISE;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int arr1[]= {10,20,30,40};
		
		int arr2[]= {15,25,35,45,55,60,70};
		
		int ans[]=mergeTwoArrays(arr1,arr2);
		
		for(int i=0;i<arr1.length+arr2.length;i++)
		{
			System.out.print(ans[i]+"   ");
		}
		
	}
	
	public static int[] mergeTwoArrays(int arr1[],int arr2[])
	{
		
		int n=arr1.length,m=arr2.length;;
		int ans[]=new int[n+m];
		
		int k=0;
		
		int i=0,j=0;
		
		while(i<n && j<m)
		{
		     if(arr1[i] < arr2[j])
		     {
		    	ans[k] = arr1[i];
		    	i++;
		     }
		     else
		     {
		    	 ans[k]=arr2[j];
		    	 j++;
		     }
		     
		     k++;
		}
		
		if(i<n)
		{
			while(i<n)
			{
				ans[k]=arr1[i];
				k++;
				i++;
			}
		}
		
		if(j<m)
		{
			while(j<m)
			{
				ans[k]=arr2[j];
				k++;
				j++;
			}
		}
		
		
		
		return ans;
	}
	
	

}
