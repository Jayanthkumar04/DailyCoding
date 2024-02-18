package recursionss;

public class StringTraversals {

	
	public static void print(int index,String s)
	{
		if(index == s.length())
			return;
		System.out.print(s.charAt(index));
		print(index+1,s);
	}
	public static void main(String[] args) {

		String s="jayanth kumar";
		
		print(0,s);
	}

}
