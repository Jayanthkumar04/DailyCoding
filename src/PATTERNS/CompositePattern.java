package PATTERNS;

public class CompositePattern {

	public static void main(String[] args) {

		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i+1;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		
		
		}
		
		
		System.out.println("other");
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i+1;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(64+k));
			}
			System.out.println();
		}
		
		
		System.out.println("RHOMBUS");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i+1;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=n;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("STAR PYRAMID");
		
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n;j>=i+1;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		System.out.println("NUMBER PYRAMID PALINDROME");
		
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n;j>=i+1;j--)
			{
				System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l+" ");
			}
		
			System.out.println();
		}
	}

}
