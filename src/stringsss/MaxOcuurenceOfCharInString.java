package stringsss;

public class MaxOcuurenceOfCharInString {
	
		public static void main(String[] args) {
		
		String s="abccazaab";
		
		char[] ans=s.toCharArray();
		
		int freq[] = new int[125];
		
		for(int i=0;i<ans.length;i++)
		{
			
			int c = (int) ans[i];
			
			freq[c]++;
			
		}
		
		for(int i=97;i<=122;i++)
		{
			System.out.println((char)(i)+" - "+freq[i]);
		}
		
		int mx=0;
		for(int i=0;i<freq.length;i++)
		{
			
			mx=Math.max(mx, freq[i]);
			
		}
		
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i] == mx)
			{
				System.out.println((char)(i));
			    break;
			}
		}

		
		
		
		
	}

}
