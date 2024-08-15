package sortingTechniques;

public class QuickSort {

	public static void swap(int arr[],int i,int j)
	{
		
		int temp = arr[i];
		
		arr[i] = arr[j];
		
		arr[j] = temp;
		
		
	}
	public static int partition(int arr[],int low,int high)
	{
		
		int pivot = arr[low];
		
		int smallerCount=0;
		
		for(int i=low+1;i<=high;i++)
		{
			if(arr[i]<=pivot)
			{
				smallerCount++;
			}
			
			
		}

		int correctIdx=low+smallerCount;
		
			swap(arr,low,correctIdx);
		

			int i=low,j=high;
			
			
			while(i<correctIdx && j>correctIdx)
			{
				
				if(arr[i] < pivot)
				{
					i++;
				}
				
				else if(arr[j]>pivot)
				{
					j--;
				}
				else if(arr[i]>pivot && arr[j]<=pivot)
				{
					swap(arr,i,j);
				}
				
			}
			
		return correctIdx;	
		
	}
	public static void quickSort(int arr[],int low,int high)
	{
		if(low>=high) return;
		int index = partition(arr,low,high);
		
		quickSort(arr,low,index-1);
		
		quickSort(arr,index+1,high);
		
		
		
	}
	public static void main(String[] args) {

		
		int arr[] = {10,8,11,100,99,56,1};
		
		int low = 0;
		
		int high = arr.length-1;
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
		quickSort(arr,low,high);
		
		
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
		
	}

}
