package _2DARRAYS;

public class TransposeSingleArray {

	public static void swap(int arr[][],int i,int j)
	{
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
		
	}
	public static void main(String[] args) {

		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				  	swap(arr,i,j);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
