package recursionss;

public class SkipOccurenceOfCharacter {

	public static void skip(int i,String s,String ans)
	{
		if(i == s.length()) {
			
			System.out.println(ans);
			return;
		}
		
		if(s.charAt(i) != 'a') skip(i+1,s,ans+s.charAt(i));
		
		else skip(i+1,s,ans);
	}
	public static void main(String[] args) {

		
		//skip occurence of "a" using recursionss
		
		String s="jaayanth kumar";
	
	
		skip(0,s,"");
	}

}
