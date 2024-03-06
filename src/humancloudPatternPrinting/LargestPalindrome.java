package humancloudPatternPrinting;

public class LargestPalindrome {

	public static void main(String[] args) {

		String s="12122";
		
		boolean flag = true;
		for(int i=s.length();i>=1;i--)
		{
			for(int j=0;j<=s.length()-i;j++)
			{
				String t=s.substring(j,j+i);
				
				StringBuffer sb = new StringBuffer(t);
			
			    if(t.equals(""+sb.reverse()))
			    {
			    	System.out.println(t);
			    	flag=false;
			    	break;
			    }
			    
			    
			}
			
			if(flag == false) break;
		}
	}

}
