package recursionss;

import java.util.Scanner;

public class MazePath {

	public static int paths(int rows,int cols,int m,int n)
	{
		
		if(rows == m || cols == n) return 1;
		
	    int downway = paths(rows+1,cols,m,n);
	    
	    int rightway=paths(rows,cols+1,m,n);
	    
	    return downway+rightway;
	
		
	}

	public static int paths2(int m,int n)
	{
		
		if(m==1 || n==1) return 1;
		
	    int downway = paths2(m-1,n);
	    
	    int rightway=paths2(m,n-1);
	    
	    return downway+rightway;
	
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("m and n");
		
		int m=sc.nextInt();
		
		int n=sc.nextInt();
		
		System.out.println(paths(1,1,m,n));
		
		
		System.out.println(paths2(m,n));
		
		
	}

}
