package sortingTechniques;

public class KthLargestElement {
 
	static int ans;
	
	public static void swap(int arr[],int i,int j)
	{
		int temp = arr[i];
		
		arr[i] = arr[j];
		
		arr[j] = temp;
				
	}
	public static int partition(int arr[],int low,int high)
	{
		
		int pivot = arr[low];
		
		int smallerIndex = 0;
		
		for(int i=low+1;i<=high;i++)
		{
			if(arr[i]<=pivot)
			{
				smallerIndex++;
			}
		}
		
		int correctIndex = low+smallerIndex;
		
		swap(arr,low,correctIndex);
		
		int i=low,j=high;
		
		while(i<correctIndex && j>correctIndex)
		{
			
			if(arr[i] < pivot) i++;
			
			else if(arr[j] > pivot) j--;
			
			else if(arr[i]>pivot && arr[j]<=pivot)
			{
				swap(arr,i,j);
			}
			
		}
		
		
		return correctIndex; 
		
		
	}
	public static void quickSelectSort(int arr[],int low,int high,int k)
	{
		
		if(low>high) return;
		
//		if(low == high)
//		{
//			if(low == k-1)
//			{
//				ans=arr[low];
//				  return;	
//			}
//		}
		
	   int index = partition(arr,low,high);
	   
	   if(index == k-1)
	   {
		   ans=arr[index];
		   return;
	   }
	   
	   else if(k-1 < index)
	   {
		   quickSelectSort(arr,low,index-1,k);
	   }
	   
	   else 
	   {
		   quickSelectSort(arr,index+1,high,k);
	   }
		
		
	}
	
	public static void main(String[] args) {

		int arr[]= {10,45,99,1,56,9};
		
		
		int k = 1;
		
		ans=-1;
		
		quickSelectSort(arr,0,arr.length-1,k);
		
		System.out.println(ans);
		
	}

}
