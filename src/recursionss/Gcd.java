package recursionss;

public class Gcd {

	public static int method1(int a,int b)
	{
		
		for(int i=Math.min(a, b);i>=1;i++)
		{
			if(a%i == 0  && b%i == 0)
			{
				return i;
			}
			
		}
		return 1;
		
	}
	
	public static int method2(int a,int b)
	{
		if(b%a == 0) return a;
		
		return method2(b%a,a);
	}
	public static void main(String[] args) {

		int a=5,b=17;
		
		int ans1 = method1(a,b);
		
		int ans2 = method2(a,b);
		
		System.out.println("answer 1= "+ans1);
		

		System.out.println("answer 2= "+ans2);
	}

}
