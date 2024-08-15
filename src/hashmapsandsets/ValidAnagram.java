package hashmapsandsets;

import java.util.HashMap;

public class ValidAnagram {

	public static boolean anagram(String s1, String s2)
	{
		
		if(s1.length() != s2.length()) return false;
		HashMap<Character,Integer> h1 = new HashMap<>();
	
		HashMap<Character,Integer> h2 = new HashMap<>();
		
		for(int i=0;i<s1.length();i++)
		{
			char key = s1.charAt(i);
			if(h1.containsKey(key))
			{
				int n = h1.get(key);
				h1.put(key,n+1);
			}
			else {
				h1.put(key, 1);
			}
		}
		
		for(int i=0;i<s2.length();i++)
		{
			char key = s2.charAt(i);
			if(h2.containsKey(key))
			{
				int n = h2.get(key);
				h2.put(key,n+1);
			}
			else {
				h2.put(key, 1);
			}
		}
		for(char i:h1.keySet())
		{
			int val1 = h1.get(i);
			if(!h2.containsKey(i)) return false;
			int val2 = h2.get(i);
			
			if(val1 != val2) return false;
		}
		return true;
		
	}
	public static void main(String[] args) {

		String s1 = "anagram";
		
		String s2 = "nagaram";
		
		if(anagram(s1,s2))System.out.println("it is valid anagram");

		else System.out.println("not valid anagram");
	}
	

}
