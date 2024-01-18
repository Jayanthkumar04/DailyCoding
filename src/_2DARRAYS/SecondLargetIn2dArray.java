package _2DARRAYS;

public class SecondLargetIn2dArray {

	public static void main(String[] args) {

		int arr[][]= {{1,2}, {3,10}, {4,5}};
		
		int mx=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				
				if(arr[i][j] > mx)
				{
					mx=arr[i][j];
				}
				
			}
		}
		
		System.out.println("The larget element in 2d array is "+mx);
		
	}

}
