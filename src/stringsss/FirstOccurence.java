package stringsss;

import java.util.Scanner;

public class FirstOccurence {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enterr string");
		
		String s1=sc.nextLine();
		
		System.out.println("enter char");
		char c=sc.next().charAt(0);
		
		int n = firstocc(c,s1);
		
		System.out.println("the first occurnce of '"+c+"' in "+s1+" is "+n);
	}
	
	
	public static int firstocc(char c,String s1)
	{
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) == c) return i;
			
		}
		
		return -1;
	}

	
}
