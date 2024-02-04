package sortingTechniques;

public class BubbleSortInDecreasingOrder {

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

		int arr[]= {1, 2, 3, 4, 5};
		
		print(arr);
		
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			
			boolean flag = true;
			
			for(int j=0;j<n-i-1;j++) {
				
				if(arr[j+1] > arr[j])
				{   
					flag = false;
					swap(arr,j,j+1);
				}
			}
			
			if(flag == true)
			{
				break;
			}
		}
		
		print(arr);
		
	}

}
