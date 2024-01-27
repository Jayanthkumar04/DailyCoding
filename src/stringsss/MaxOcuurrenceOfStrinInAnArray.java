package stringsss;

public class MaxOcuurrenceOfStrinInAnArray {
	public static int countWords(String[] words1, String[] words2) {
        
	      int mx=0;

	      for(int i=0;i<words2.length;i++)
	      {    
	          int c = 0;
	          for(int j=0;j<words1.length;j++)
	          {
	              if(words2[i].equals(words1[j]))
	              {
	                  c++;
	              }

	          }
	          if(c>mx)
	          {
	              mx=c;
	          }
	      } 

	return mx;

	    }


	public static void main(String[] args) {

		String[] words1 = {"leetcode","is","amazing","as","is"};
		String[] words2 = {"amazing","leetcode","is"};
		
		
		int ans=countWords(words1,words2);
		
		System.out.println(ans);

	}

}
