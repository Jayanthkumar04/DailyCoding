package stringsPractise;

public class RemoveAllCharsExceptAlphabets {

	public static void main(String[] args) {

		String str = "abc123@@def";
		
		str=str.toLowerCase();
		
		System.out.println(str);
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				ans=ans+str.charAt(i);
			}
			
		}
		
		System.out.println(ans);
	}

}
