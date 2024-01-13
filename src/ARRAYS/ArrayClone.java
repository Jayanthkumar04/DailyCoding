package ARRAYS;

import java.util.Arrays;

public class ArrayClone {

	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, 4, 5, 6};
		System.out.println("arr array");
		for(int ans:arr)
		{
			System.out.print(ans+" ");
		}
		
		//SHALLOW COPY

		System.out.println("\nshallow copy");
		System.out.println("arr2 array");
		int arr2[]=arr;
		
		for(int ans:arr2)
		{
			System.out.print(ans+" ");
		}

		System.out.println();
		
		arr2[3]=121;

		for(int ans:arr)
		{
			System.out.print(ans+" ");
		}

		
		System.out.println("\nDeep copy");
		System.out.println("arr3 array");
		int arr3[]=Arrays.copyOf(arr,arr.length);
		
		arr3[1]=9;
		for(int ans:arr)
		{
			System.out.print(ans+" ");
		}
		

		System.out.println("\narr3 array");
		for(int ans:arr3)
		{
			System.out.print(ans+" ");
		}
		
		
	}

}
