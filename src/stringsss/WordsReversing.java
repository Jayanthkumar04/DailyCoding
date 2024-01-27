package stringsss;

public class WordsReversing {

	public static void  reverse(StringBuilder sb,int i,int j)
    {
           while(i<=j)
              {
              char temp = sb.charAt(i);
              sb.setCharAt(i,sb.charAt(j));
              sb.setCharAt(j,temp);
             
                i++;
                j--;
              }


    }
	public static void main(String[] args) {


  
  StringBuilder sb = new StringBuilder("jay is good");

  int i=0,j=0;

  int n=sb.length();

  while(j<n)
  {

    if(sb.charAt(j) != ' ')
    {
        j++;
    }
    else
    {
        reverse(sb,i,j-1);
      
        i=j+1;
        j=i;
        
        /*if more than one space then use follwing code
         * 
         * while(j>n && sb.charAt(j) == ' ')
         * {
         * j++;
         * }
         * i=j
         * 
         * 
         */
        

    }


  }

   reverse(sb,i,j-1);
		
		
		System.out.println(sb);
	}

}
