package sortingTechniques;

public class SelectioSort {
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
			
		}
		System.out.println();
	}
    public static void swap(int arr[],int i,int j)
    {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }

	public static void main(String[] args) {

		int arr[] = {5,4,3,2,1};
		
		print(arr);
		
		int n= arr.length;
		
		for(int i=0;i<n-1;i++)
		{
			int index = -1;
			
			int mx = Integer.MAX_VALUE;
			
			for(int j=i;j<n;j++)
			{
			     
				if(arr[j] < mx)
				{
					mx=arr[j];
					index=j;
				}
			}
			
			swap(arr,i,index);
		}
		
		print(arr);
	}

}
