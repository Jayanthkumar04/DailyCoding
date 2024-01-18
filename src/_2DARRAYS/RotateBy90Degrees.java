package _2DARRAYS;

public class RotateBy90Degrees {

	public static void main(String[] args) {

//		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

		int arr[][] = {{1,2},{4,5},{7,8}};

		for(int i=0;i<arr[0].length;i++)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				System.out.print(arr[j][i]+"    ");
			}
			System.out.println();
		}
		
	}

}
