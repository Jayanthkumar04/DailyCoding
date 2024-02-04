package stringsPractise;

public class SumInStrings {

	public static void main(String[] args) {

		String str="12ab2090";
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			int c = (int)str.charAt(i);
			
			if(c >=48 && c<=57)
			{
				count=count+(c-48);
			}
		}
		
		System.out.println(count);
		
	}

}
