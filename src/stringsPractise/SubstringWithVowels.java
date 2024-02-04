package stringsPractise;

public class SubstringWithVowels {

	public static void main(String[] args) {

//		String s="aeibc";
		
		String s="abcd";
		int count = 0;
		for(int i=0;i<=s.length();i++) {
			
			for(int j=i+1;j<=s.length();j++) {
				
				String ans = s.substring(i,j);
				  int flag = 0;
				for(int k=0;k<ans.length();k++)
				{
					if(ans.charAt(k)=='a' || ans.charAt(k)=='e'|| ans.charAt(k)=='i'|| ans.charAt(k)=='o'|| ans.charAt(k)=='u')
					{
						
					}
					else
					{
						flag=1;
					}
					
				}
				
				if(flag == 0)
				{
					count++;
				}
					
				
				
			}
			
		}
		
		System.out.println(Character.isLetter('1'));
	
		System.out.println(count);
		
	}

}
