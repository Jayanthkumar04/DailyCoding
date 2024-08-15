package recursionss;

public class ApowerBM2 {

	
	public static int pow(int a,int b)
	{
		
		if(b == 0) return 1;
		
		int ans = pow(a,b/2);
		
		if(b % 2 == 0)
		{
			return ans * ans;
		}
		else
		{
			return ans * ans * a;
		}
		
	}
	public static void main(String[] args) {

		
		System.out.println(pow(2,6));
		
		
	}

}
