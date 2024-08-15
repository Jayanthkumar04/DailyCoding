package recursionss;

public class Sum_one_to_N {

	public static int getSum(int n)
	{
		if(n == 0) return 0;
		return n + getSum(n-1);
	}
	public static void main(String[] args) {
		
		
		int sum = getSum(10);
		
		
		System.out.println(sum);
		
		
	}

}
