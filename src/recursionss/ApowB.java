package recursionss;

public class ApowB {

	public static int pow(int a,int b)
	{
		if(b == 0) return 1;
		
		return a*pow(a,b-1);
	}
	public static void main(String[] args) {

		
		int a=5,b=4;
		
		int ans=pow(a,b);
		
		System.out.println(ans);
	}

}
