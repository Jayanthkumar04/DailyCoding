package _2DARRAYS;

import java.util.Scanner;

public class BASICS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[][]= new int[2][2];
		
		System.out.println("enter elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
			System.out.print(arr[i][j]+"   ");
			}
			
			System.out.println();
		}
		
		
		
		int prac[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		for(int ans[]:prac)
		{
			for(int val:ans)
			{
				System.out.print(val+"   ");
			}
			System.out.println();
		}
		
	}

}
