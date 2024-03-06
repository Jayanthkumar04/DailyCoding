package humancloudPatternPrinting;

public class ChangeCase {

	public static void changeCase(String str)
	{
		String ch1=str.substring(0,1).toUpperCase();
		
		String ch2=str.substring(1).toLowerCase();
		
		System.out.print(ch1+ch2+" ");
		
		
	}
	public static void main(String[] args) {

		
		String str="thIs is My clAss";
		
		String ch[] = str.split(" ");
		
		for(String s:ch)
		changeCase(s);
		
		System.out.println();
		int r =(1+(int)(Math.random()*100));
		
		System.out.println(r);
	
		
	}

}
