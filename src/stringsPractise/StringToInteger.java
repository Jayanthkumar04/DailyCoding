package stringsPractise;

public class StringToInteger {

	public static void main(String[] args) {
		String s="109567";
		int count = 0;
		int n = 0;
		for(int i=s.length()-1;i>=0;i--)
		{
			int d = (int)s.charAt(i);
		    count=count+(int)(s.charAt(i)-48)*(int)Math.pow(10, n);
		    n++;	
		}
		System.out.println(count+1);	
	}
}