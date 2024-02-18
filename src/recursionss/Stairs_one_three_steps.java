package recursionss;

public class Stairs_one_three_steps {

	public static int stairs(int n)
	{
		if(n<=2) return n;
		
		return stairs(n-1)+stairs(n-3);
	}
	public static void main(String[] args) {

//		no.of ways climbing the stairrsssssssss
		
		
		int ans = stairs(4);
		
		System.out.println(ans);
	}

}
