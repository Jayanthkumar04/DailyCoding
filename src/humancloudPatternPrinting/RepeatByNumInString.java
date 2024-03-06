package humancloudPatternPrinting;

public class RepeatByNumInString {

	public static void main(String[] args) {

		String s ="a2b4c1";
		
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				for(int j=0;j<(s.charAt(i)-48)-1;j++)
				{
					ans=ans+s.charAt(i-1);
				}
			}
			else
			{
				ans=ans+s.charAt(i);
			}
		}
		
		System.out.println(ans);
	}

}
