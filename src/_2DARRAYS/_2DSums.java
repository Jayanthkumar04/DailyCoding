package _2DARRAYS;

public class _2DSums {

	public static void main(String[] args) {

		int arr1[][] = {{1,2,3},{4,5,6}};
		
		int arr2[][] = {{2,3,4},{10,0,1}};
		
		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length)
		{
			
			for(int i=0;i<arr1.length;i++)
			{
				int sum=0;
				for(int j=0;j<arr1[0].length;j++)
				{
					sum=arr1[i][j]+arr2[i][j];
					
					System.out.print(sum+"  ");
					
				}
				
			System.out.println();
			
			}
			
		}else {
			System.out.println("the length of matrices not equal");
		}
		
	}

}
