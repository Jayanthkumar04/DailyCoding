package recursionss;

import java.util.*;
public class PrintSubstrings {

	static ArrayList<String> al = new ArrayList<>();
	
	public static void printSubSets(int i,String s,String ans)
	{
		
		if(i == s.length())
		{
			al.add(ans);
			
			return;
		}
		
		
		printSubSets(i+1,s,ans);//dont take
		char ch = s.charAt(i);
		
		printSubSets(i+1,s,ans+ch);//take
		
		
		
	}
	
	public static void main(String[] args) {

		
		String s = "abc";
		
		printSubSets(0,s,"");
		
		System.out.println(al);
	}

}
