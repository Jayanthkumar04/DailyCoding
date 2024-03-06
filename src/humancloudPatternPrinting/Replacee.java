package humancloudPatternPrinting;

public class Replacee {

	public static void main(String[] args) {

		String s1 = "aabcda";
		
		String s2 = s1.replace("a","k");
		
		System.out.println(s2);
		
		//remove occurences of "a"
		
		String s3 = s1.replace("a","");
		
		System.out.println(s3);
		
		//replace all lower case with null
		
		String s4 = "aaBCDD";
		
		String s5 = s4.replaceAll("[a-z]","");
		
		System.out.println(s5);
		
		String s6="!@4fs$";
		
		String s7 = s6.replaceAll("[a-z A-Z 0-9]","");
		
		System.out.println(s7);
		
		
		int a=2014;
		
		int res=0;
		
		while(a != 0)
		{
			int rem=a%10;
			
			res=res*10+rem;
			
			a=a/10;
		}
		
		System.out.println(res);
		
		
		
		
		
	}

}
