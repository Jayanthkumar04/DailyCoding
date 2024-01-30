package stringsPractise;

public class StringPalindrome {

	public static void main(String[] args) {

		String s ="malala";
		
		char ch[] = s.toCharArray();
		
		
		int i=0,j=ch.length-1;
		
		int flag=0;
	    while(i<j) {
	    	
	    	if(ch[i] != ch[j]) {
	    		
	    		System.out.println("not a palindrom");
	            flag = 1;
	    		break;
	    	}
	    	
	    	i++;
	    	j--;
	    	
	    }
	    
	    if(flag == 0)
	    {
	    	System.out.println("palindrome");
	    }
	    
		
	}

}
