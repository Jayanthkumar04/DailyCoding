package HASHHING;

import java.util.Scanner;

public class NumberHash {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String str="hellohe";
		
		int hash[]=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			
			hash[str.charAt(i)-'a']++;
		}
		
		int questions=5;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter character");
			
			char c=sc.next().charAt(0);
			
			System.out.println(hash[c-'a']);
			
		}
		
	}

}
