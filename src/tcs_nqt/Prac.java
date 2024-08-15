package tcs_nqt;

public class Prac {

	public static int doans(int m,int n)
	{
		
		if(m == 1 || n == 1)
		{
			return 1;
		}
		
		int down = doans(m-1,n);
		
		int right = doans(m,n-1);
		
		return down+right;
		
	}
	public static void main(String[] args) {

		
		int ways = doans(3,3);
		
		System.out.println(ways);
	}

}
