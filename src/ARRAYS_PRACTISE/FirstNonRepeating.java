package ARRAYS_PRACTISE;

public class FirstNonRepeating {

	public static void main(String[] args) {

		int arr[]= {1, 2, 3, 1, 2, 10, 1, 5, 11,3,10,99,5,11};
		
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
				
			}
			if(count == 1)
			{
				ans=arr[i];
				System.out.println("the first non repeating integer in the arrray is: "+ans);
				break;
			}
		}
		
	}

}
