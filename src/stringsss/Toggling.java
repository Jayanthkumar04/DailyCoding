package stringsss;

import java.util.Scanner;

public class Toggling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter string");
		
	StringBuilder sb = new StringBuilder(sc.nextLine());
	
	System.out.println(sb);
	for(int i=0;i<sb.length();i++)
	{
		char ch = sb.charAt(i);
		
		int asci = (char)ch;
		
		if(asci >=65 && asci <=90)
		{
			
			asci=asci+32;
			
			ch=(char)asci;
			
			sb.setCharAt(i, ch);
			
		}
		else if (asci >=97 && asci<=122) {
			asci=asci-32;
			ch=(char)asci;
			sb.setCharAt(i, ch);
		}
		
		
		
	}
	
	System.out.println(sb);
	
	
	String str="jayKuma AAARR";
	
	String ans="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		
		int num=(int)ch;
		
		if((int)str.charAt(i) >=65 && (int)str.charAt(i)<=90)
		{
			num=num+32;
			ans=ans+(char)num;
		}
		
		else if((int)str.charAt(i) >=97 && (int)str.charAt(i)<=122)
		{   num=num-32;
			ans=ans+(char)num;
		}
		
		
	}
	
	System.out.println(ans);
	 
		
	}

}
