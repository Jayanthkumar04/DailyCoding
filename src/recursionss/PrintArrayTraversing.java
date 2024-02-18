package recursionss;

public class PrintArrayTraversing {

	public static void print(int i,int arr[])
	{
		if(i == arr.length)
			return;
		
		System.out.println(arr[i]);
		  print(i+1,arr);
		
	}
	
	public static void print2(int index,int arr2[])

	{
		
		if(index == arr2.length)
			return;
		
		System.out.println(arr2[index]);
		print2(index+1,arr2);
		
	}
	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5};
		
		print(0,arr);
		
		
		int arr2[]= {10,20,30,40,50};
		
		print2(0,arr2);
		
		
		
	}

}
