package ARRAYS;

//REVERSE THE ARRAY WITH TWO POINTERS

public class TwoPointers {

	public static void reverse(int arr[],int i,int j)
	{
		
		swap(arr,i,j);
		
		
	}
	
	public static void swap(int arr[],int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
			i++;
			j--;
		}
	}
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		
		System.out.println("beforre reveerse");
		
		for(int ans:arr)
		{
			System.out.print(ans+"  ");
		}
		System.out.println();
		
	    reverse(arr,0,arr.length-1);
		
System.out.println("after reveerse");
		
		for(int ans:arr)
		{
			System.out.print(ans+"  ");
		}
		
	}

}
