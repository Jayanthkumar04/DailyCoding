package PATTERNS;

public class SpecialPattern {

	public static void main(String[] args) {

		int n = 5;
		
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{  
        
				System.out.print(count+" ");
		       count++;	  
			}
			
			System.out.println();
		}
		
		
		System.out.println("star pluss");
		
		int n1 = 5;
		
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n1;j++)
			{
				if((n1/2)+1 == i || (n1/2)+1 == j)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("\nCRROSS STARRR");
		
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<= n1;j++)
			{
				int f=i;
				int l=n1-i+1;
				
				if(j == f || j == l)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}
		
	}

}
