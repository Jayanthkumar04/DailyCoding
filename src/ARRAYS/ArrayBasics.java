package ARRAYS;

import java.util.*;
public class ArrayBasics {

	public static void main(String[] args) {

		int[] arr;
		
		arr=new int[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int ele:arr)
		{
			System.out.print(ele+" ");
		}
		
		
		System.out.println();
		
	     String[] fruits= {"kiwi","orange","guava","banana"};
		
	     for(String val:fruits)
	     {
	    	 System.out.println(val);
	     }
	     
	     
	     
	     
	     
	}

}
