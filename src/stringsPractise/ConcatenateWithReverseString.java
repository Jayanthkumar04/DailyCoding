package stringsPractise;

public class ConcatenateWithReverseString {

	public static void main(String[] args) {

		String s="jay";
		
		char ans[] = s.toCharArray();
		
		int i=0,j=s.length()-1;
		
		while(i < j)
		{
			char temp = ans[i];
			
			ans[i] = ans[j];
			
			ans[j] = temp;
			
			i++;
			j--;
		}
		
		
		String a = new String(ans);
		
		System.out.print(s+a);
		
	}

}
