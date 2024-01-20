package _2dlists;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingle {

	public static void main(String[] args) {

		int n=5;
		
       int ans[][] = new int[n][];
       
       for(int i=0;i<n;i++)
       {
    	   ans[i]=new int[i+1];
    	   
    	   ans[i][0]=ans[i][i]=1;
    	   
    	   for(int j=1;j<i;j++)
    	   {
    		   ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
    	   }
       }
       
       
       for(int i=0;i<ans.length;i++)
       {
    	   for(int j=0;j<=i;j++)
    	   {
    		   System.out.print(ans[i][j]+"  ");
    	   }
    	   
    	   System.out.println();
       }
		
		
	}

}
