package PATTERNS;

public class NumberBridge {

	public static void main(String[] args) {

		
		int n = 4;
		
		for(int i=1;i<=2*n-1;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		n--;
		
		for(int i=1;i<=n;i++)
		{
			int count = 1;
			for(int j=n;j>=i;j--)
			{
				System.out.print(count++ +" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("  ");
				count++;
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print(count++ +" ");
			}
			
			System.out.println();
		}
		
		
	}

}
