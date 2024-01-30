package stringsss;

public class Isomorphic {

	public static boolean iso(String s1,String s2)
	{
		

		char s11[] = s1.toCharArray();
	    char s22[] = s2.toCharArray();
	    
	    if(s11.length != s22.length)
	    	return false;
	    
	    int freq[] = new int[128];
	    
	    for(int i=0;i<s11.length;i++)
	    {
	    	int index = (int)s11[i];
	    	
	    	int c = (int)s22[i];
	    	if(freq[index] == 0)
	    	{
	    		freq[index] = c;
	    	}
	    	else
	    	{
	    		if(freq[index] != c)
	    		{
	    			return false;
	    		}
	    	}
	    	
	    }
	    
	    return true;
		
	}
	public static void main(String[] args) {

		
		String s1 = "egg";
		
		String s2 = "add";
		
		boolean ans = iso(s1,s2);
	    
	    
		System.out.println(ans);
		
		
	}

}
