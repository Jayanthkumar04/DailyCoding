package stringsPractise;

public class CapitalizeFirstAndLastWordInString {

	public static void main(String[] args) {

		String str="i am the best bro";
		
		char ch[]=str.toCharArray();
		int i=0,j=0;
		while(j<str.length())
		{
			if(ch[j] !=' ') j++;
			
			else
			{
				if((int)ch[i] >=97 && (int)ch[i]<=122)
				{
					ch[i]=(char)(ch[i]-32);
				}
				if((int)ch[j-1]>=97 && (int)ch[j-1]<=122)
				{
					ch[j-1]=(char)(ch[j-1]-32);
				}
				
				i=j+1;
				j=i;
			}
			
		}
		
		if((int)ch[i] >=97 && (int)ch[i]<=122)
		{
			ch[i]=(char)(ch[i]-32);
		}
		if((int)ch[j-1]>=97 && (int)ch[j-1]<=122)
		{
			ch[j-1]=(char)(ch[j-1]-32);
		}
		
		System.out.println(ch);
		
	}

}
