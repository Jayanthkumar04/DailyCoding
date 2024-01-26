package stringsss;

public class StrMethods {

	public static void main(String[] args) {

		String s1="abc";
		
		String s2="aba";
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println();
		
		for(int i=0;i<s1.length();i++)
		{
			
			for(int j=i+1;j<=s1.length();j++)
			{
				System.out.println(s1.substring(i,j));
			}
			
		}
		
	}

}
