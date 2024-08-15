package slidingwindows;

public class MaxSumSubArraySlidingWindowTechnique {

	public static void main(String[] args) {

        int arr[] = {10,20,1,3,-40,80,10};
		
		int k = 3;
		
		int n = arr.length;
		
		int maxSum = 0;
		
		int sum = 0;
		
		int i=0,j=k-1;
		
		for(int a=i;a<=k-1;a++)
		{
			sum = sum + arr[a];
			maxSum = sum;
		}
		
		i++;j++;
		
		while(j<n)
		{
			sum = sum - arr[i-1]+arr[j];
			
			maxSum=Math.max(maxSum, sum);
			i++;
			j++;
		}
		
		System.out.println(maxSum);
		
		
	}

}
