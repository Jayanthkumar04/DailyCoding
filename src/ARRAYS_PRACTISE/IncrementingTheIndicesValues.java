package ARRAYS_PRACTISE;

public class IncrementingTheIndicesValues {

	public static void main(String[] args) {

		int arr[]= {1, 2, 3, 4, 5, 6};
		System.out.print("THE ARRAY BEFORE CHANGE  ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();

		System.out.print("THE ARRAY AFTER CHANGE  ");
		
		int ans[]=changeArray(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(ans[i]+"  ");
		}
		
		
		
	}
	
	public static int[] changeArray(int arr[])
	{
		int ans[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%2 == 0)
			{
				ans[i]=arr[i]+10;
			}
			else
			{
				ans[i]=arr[i]*2;
			}
		}
		
		return ans;
	}

}
