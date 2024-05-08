package NUMBERS;

public class HexaToDecimal {

	public static void main(String[] args) {

		String digits = "0123456789ABCDEF";
		
	    String hex="C9";
	    
	    
	    int val = 0;
	    
	    for(int i=0;i<hex.length();i++)
	    {
	    	
	    	char c = hex.charAt(i);
	    	
	    	int d = digits.indexOf(c);
	    	
	    	val = 16*val+d;
	    	
	    }
	    
	    System.out.println(val);
	    
	}

}
