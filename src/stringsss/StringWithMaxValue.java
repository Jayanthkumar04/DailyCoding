package stringsss;

public class StringWithMaxValue {

	public static String maxValue(String[] str)
	{
		String ans=str[0];
		
		
		
		for(int i=1;i<str.length;i++)
		{
			
			ans = getMax(ans,str[i]); 
			
		}
		
		
		
		
		return ans;
	}
	
	public static String getMax(String s1,String s2)
	{
		
		 String a=filterZero(s1);
		 
		 String b=filterZero(s2);
		 
		 
		 
		 if(a.length() > b.length())
		 {
			 return s1;
		 }
		 if(a.length() < b.length())
		 {
			 return s2;
		 }
		 
		 for(int i=0;i<a.length();i++)
		 {
			 if(a.charAt(i) != b.charAt(i))
			 {
			 if((int)a.charAt(i) > (int)b.charAt(i))
			 {

				 return s1;
			 }
			 else
			 {

				 return s2;
			 }
			 
			 }
		 }
		 
		 return a;
		
	}
	
	public static String filterZero(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != '0') {
				
				return s.substring(i);
				
			}
		}
		
		return s;
		
		
	}
	
	
	public static void main(String[] args) {

		String arr[]= {"999","23455","6666667","0078000","6666666","0000000000000000000000001"};
		
		String ans=maxValue(arr);
		
		System.out.println(ans);
		
		
		
	}

}
