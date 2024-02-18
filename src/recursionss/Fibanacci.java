package recursionss;

public class Fibanacci {

	public static int fibo(int n)
	{
		
		if(n<=1) return n;
		
		return fibo(n-1)+fibo(n-2);
		
	}
	public static void main(String[] args) {

		//Nth fibnacii using recursion
		
		int ans = fibo(6);
		
		System.out.println(ans);
		
	}

}
