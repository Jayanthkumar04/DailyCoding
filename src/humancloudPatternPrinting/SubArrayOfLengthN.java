package humancloudPatternPrinting;

public class SubArrayOfLengthN {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,6,7,8};
		
		int n=3;
		
		for(int i=0;i<arr.length-n;i++)
		{
			for(int j=i;j<i+n;j++)
			{
				System.out.print(arr[j]);
			}
			
			System.out.println();
		}
	}

}
