package sortingTechniques;

public class InsertionSort {

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
			
			for(int j=i;j>=1;j--)
			{
				if(arr[j-1] > arr[j])
				{
					swap(arr,j-1,j);
				}
				else
				{
					break;
				}
			}
			
			
		}
		
		print(arr);
	}


}
