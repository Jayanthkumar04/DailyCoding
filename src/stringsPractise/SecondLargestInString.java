package stringsPractise;

public class SecondLargestInString {

	public static void main(String[] args) {
		
		
		String s[]= {"00123","6666667","6666669","23456","6666668"};
		
		String secMax = secondMax(s);
		
		System.out.println("second largest element is"+secMax);
		
		
	}
	
	public static String secondMax(String[] s)
	{
		
		String mx = s[0];
		
		for(int i=1;i<s.length;i++)
		{
			mx=max(mx,s[i]);
		}
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(mx))
			{
				s[i]="0";
			}
		}
		
         mx = s[0];
		
		for(int i=1;i<s.length;i++)
		{
			mx=max(mx,s[i]);
		}
		
		return mx;
	}
	
	public static String max(String s,String t)
	{
		String a=filterZero(s);
		String b=filterZero(t);
		
		
		if(a.length() > b.length()) return s;
		
		if(a.length() < b.length()) return t;
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(i) != b.charAt(i)) 
				
				if((int)a.charAt(i) > (int)b.charAt(i))
				{
					return s;
				}
				else
				{
				     return t;	
				}
				
			}
		
		return s;
			
		}
	
	public static String filterZero(String ans)
	{
		
		for(int i=0;i<ans.length();i++)
		{
			if(ans.charAt(i) != '0')
			{
				return ans.substring(i);
				
			}
		}
		
		return ans;
		
	}
		
	}


