package stringsPractise;

public class ReplaceWithSubStrin {

	public static void main(String[] args) {

		String s1="hello world";
		
		String s2="world";
		
		String s3="jay";
		
		String ans="";
		
		int m=s1.length(),n=s2.length(),o=s3.length();
		for(int i=0;i<m-n+1;i++)
		{
			
			if(s1.substring(i,n+i).equals(s2))
			{
				s1=s1.substring(0,i)+s3;
				
				break;
			}
			
			
		}
		
		System.out.println(s1);
	}

}
