package stringsss;

public class ReverseWithStringOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="boy";
		
		String ans="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			ans+=str.charAt(i);
		}
		
		System.out.println(ans);
	
	}

}
