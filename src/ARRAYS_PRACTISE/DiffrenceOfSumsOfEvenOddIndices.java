package ARRAYS_PRACTISE;

public class DiffrenceOfSumsOfEvenOddIndices {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60,70};
		
		int ans = difference(arr);
		
		System.out.println("Diffrence Of Sums Of Even indices and Odd Indices is = "+ans);
		
	}
	
	public static int difference(int arr[])
	{
		int ans=0;
		int even=0,odd=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(i % 2 == 0)
				 even+=arr[i];
			else
				odd+=arr[i];
		}

		ans=even-odd;
		
		return ans;
	}

}
