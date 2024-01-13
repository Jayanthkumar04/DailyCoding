package PATTERNS;

public class Triangles {

	public static void main(String[] args) {

		int n=5;
		
		System.out.println("first");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("second");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+" ");
			}
			
			System.out.println();
		}
		
		
System.out.println("third");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{  if(i%2 == 0)
				System.out.print((char)(64+j)+" ");
			 
			else
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
