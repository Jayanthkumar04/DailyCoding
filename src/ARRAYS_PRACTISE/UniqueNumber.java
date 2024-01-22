package ARRAYS_PRACTISE;

public class UniqueNumber {

	public static void main(String[] args) {

		int arr[] = {10,20,30,20,10};
		
//		int freq[]=new int[100001];
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			freq[arr[i]]++;
//		}
//		
//		for(int i=0;i<freq.length;i++)
//		{
//			if(freq[i] == 1)
//			{
//				System.out.println("the unique element is :"+i);
//				
//			}
//		}
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i] == arr[j])
				{
					arr[i]=-1;
					arr[j]=-1;
				}
				
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > 0)
			{
				System.out.println("unique element is :"+arr[i]);
			}
		}
		
		
		
	}

}
