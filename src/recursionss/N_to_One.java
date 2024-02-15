package recursionss;

public class N_to_One {

	public static int print(int n)
	{
		System.out.println(n);
		
		if(n==1)
		{
			return 0;
		}
		
		return print(n-1);
	}
	public static void main(String[] args) {

		
		print(100);
		
	}

}
