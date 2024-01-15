package ARRAYS_PRACTISE;

public class NumbersStrictlyGreaterThanX {

	public static void main(String[] args) {

		int arr[]= {20, 66, 70, 255, 40, 10};
		
		int target = 60;
		
		int ans = answer(arr,target);
		
		System.out.println("count is "+ans);
	}

	public static int answer(int arr[],int target)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > target)
			{
			count++;
			}
		}
		
		return count;
	}
}
