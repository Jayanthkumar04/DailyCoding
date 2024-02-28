package recursionss;

import java.util.ArrayList;

public class PrintAllsubSequences {

	static ArrayList<String> al = new ArrayList<>();
	
	
	public static void printing(int s,int n,int k,String ans)
	{
		
		if(ans.length() == k)
		{
			al.add(ans);
		    return;
		}
		
		printing(s+1,n,k,ans);
		
		ans=ans+s;

		printing(s+1,n,k,ans);
		
		
	}
	public static void main(String[] args) {

		
		
	int n =6,k=4;
	
	printing(1,n,k,"");
		
	}

}
