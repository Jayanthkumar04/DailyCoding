package hashmapsandsets;

import java.util.HashSet;

public class MaxNoOfStringPairs {

	public static String reverse(String str)
	{
		
		
		return new StringBuilder(str).reverse().toString();
		
	}
	public static void main(String[] args) {

		String words[] = {"cd", "ac", "dc", "ca", "zz"};
		
		HashSet<String> hs = new HashSet<>();
		
		int count = 0;
		
		for(int i=0;i<words.length;i++)
		{   
        	if(hs.contains(reverse(words[i])))
			{
			count++;	
			}
			else {
				hs.add(words[i]);
			}	
		}
		
		
		System.out.println(count);
		
		
	}

}
