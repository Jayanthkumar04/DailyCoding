package stringsss;

public class ForTesting {

	public static void main(String[] args) {

		String s="000123000";
		
		for(int i=0;i<s.length();i++)
		{  
			if(s.charAt(i) == '0')
			s=s.substring(i+1);
		}
		
		System.out.println(s);
		
	}

}
