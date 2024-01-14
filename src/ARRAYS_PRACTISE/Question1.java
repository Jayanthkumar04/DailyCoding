package ARRAYS_PRACTISE;
//product of all the numbers in an array
public class Question1 {

	public static void main(String[] args) {

	
		int arr[] = {1,5,6,2,10};
		
		int ans = product(arr);
		
		System.out.println("answer is "+ans);
		
		
	}
	
	public static int product(int arr[])
	{
		int ans = 1;
		for(int i=0;i<arr.length;i++)
		{
			ans=ans * arr[i];
		}
		
		return ans;
	}

}
