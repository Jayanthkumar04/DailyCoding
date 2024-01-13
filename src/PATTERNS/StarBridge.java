package PATTERNS;

public class StarBridge {

	public static void main(String[] args) {

		int n = 3;
		for(int i=1;i<=n*2-1;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
		n--;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("  ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
