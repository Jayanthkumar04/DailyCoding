package tcs_nqt;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {

		
		int arr[]= {1 , 12 , 2 , 14 , 3 , 16 , 4};
		
		
		int sum = 19;
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			int ansSum=arr[i];
			
			boolean flag1 = false;
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(ansSum == sum)
				{
					System.out.println("between index "+i+" to index"+(j-1));
					
					flag1 = true;
					
				    break;
				
				}
				
				else if(ansSum>sum || j==arr.length)
				{
					break;
				}
				
				ansSum+=arr[j];
				
			}
			
			if(flag1 == true)
			{
				break;
			}
			
			
			
			
			
		}
		
		
	}

}
