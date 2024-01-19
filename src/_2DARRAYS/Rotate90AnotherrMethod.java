package _2DARRAYS;

public class Rotate90AnotherrMethod {
	public static void swap(int arr[][],int i,int j,int k)
	{
		int temp=arr[k][i];
		arr[k][i]=arr[k][j];
		arr[k][j]=temp;
		
	}
	public static void main(String[] args) {


	int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				  	swap(arr,i,j,i);
			}
		}
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			
				int k=0, l=arr[0].length-1;
			 while(k<l)
			 {
				swap(arr,k,l,i);
			    k++;
			    l--;
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
