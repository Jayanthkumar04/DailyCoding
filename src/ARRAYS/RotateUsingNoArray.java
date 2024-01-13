package ARRAYS;

public class RotateUsingNoArray {
	
	public static void rotate(int arr[],int k)
	{
		int n=arr.length;
		
		k=k%n;
		
		reverse(arr,0,n-k-1);
		
		reverse(arr,n-k,n-1);
		
		reverse(arr,0,n-1);
	
		
	}
	
	public static void reverse(int arr[],int i,int j)
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

int arr[]= {10,20,30,40,50,60,70};
		
		System.out.println("before rotate");
		
		for(int ans:arr)
		{
			System.out.print(ans+" ");
		}
		
		System.out.println("\nafter rotate");
		
		rotate(arr,5);
		
		for(int ans:arr)
		{
			System.out.print(ans+" ");
		}
		
		
		
	}

}
