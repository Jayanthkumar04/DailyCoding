package stringsPractise;

import java.util.Scanner;



public class NoOfConstants {

	public static int constants(String s)
	{
		
		int c=0;
		
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch != 'a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' )
			{
				c++;
			}
			
		}
		
		return c;
	}
	
	public static void main(String[] args) {

		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int count = constants(s);
		
		System.out.println("no of constatnts are: "+count);
		
		
	}

}
