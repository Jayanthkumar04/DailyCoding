package PATTERNS;

public class SpecialPattern2 {

	public static void main(String[] args) {

		System.out.println("BINARRY TRIANGLE");
		
		int n=5;
		
		int flag;
		for(int i=1;i<=n;i++)
		{  if(i%2 == 0) {
			
			flag=0;
			
		        }
		else
		{
			flag=1;
		}
			for(int j=i;j>=1;j--)
			{
                  if(flag == 1)
                  {
				    System.out.print(flag+" ");
                    flag=0;
                  }
                  else
                  {
                	  System.out.print(flag+" ");
                	  flag=1;
                  }
			}
			System.out.println();
		}
		
		System.out.println("star triangle flipped");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i+j > n)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
				
			}
			
			System.out.println();
		}
		
		System.out.println("star trriangle flipped other method");
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
			 System.out.print("  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("star flipped in nuberrs");
		
		
		for(int i=1;i<=n;i++)
		{
			int count=1;
			for(int j=1;j<=n;j++)
			{
				if(i+j > n)
				{
					System.out.print(count++ +" ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
