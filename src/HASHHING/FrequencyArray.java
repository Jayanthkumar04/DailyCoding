package HASHHING;

import java.util.Scanner;

public class FrequencyArray {

	public static void main(String[] args) {
		
		
		int arr[]=new int[5];
		
		int hash2[]=new int[100000000];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int hash[]=new int[12];
		for(int i=0;i<5;i++)
		{
			
		  hash[arr[i]]=hash[arr[i]]+1;
			
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("ask");
			int que=sc.nextInt();
			
			System.out.print(hash[que]);
		}
		
		
	}

}
