package ARRAYS_PRACTISE;

public class SmallestMissingPositiveInSortedArrray {

	public static void main(String[] args) {

		int arr[]= {-5,-2,0,1,2,3,4,5,10};
		
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0 && (arr[i+1] == arr[i]+1))
					{
				
					}
			else if(arr[i]>=0 && (arr[i+1] != arr[i]+1 ))
			{
				
				ans = arr[i]+1; 
				break;
				
			}
			
		}
		
		System.out.println(ans);
		
	}

}
