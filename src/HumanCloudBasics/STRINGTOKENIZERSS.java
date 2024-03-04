package HumanCloudBasics;

import java.util.StringTokenizer;

public class STRINGTOKENIZERSS {

	public static void main(String[] args) {

		
		String a="hello bro how r u";
		
		StringTokenizer str = new StringTokenizer(a," ");
		
		
		while(str.hasMoreTokens()==true){
			
			
			System.out.println(str.nextToken());
			
			
		}
		
	}

}
