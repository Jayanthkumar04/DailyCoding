package humancloudPatternPrinting;

public class APrint {

	public static void main(String[] args) {

		int n=5;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==0)
				{
					if(j == 0 || j == n-1)
					{
						System.out.print("  ");
					}
					else
					{
						System.out.print("* ");
					}
				}
			    else if(i==n/2)
				{
					System.out.print("* ");
				}
				
			    else if(i>0)
			    {	
				if(j==0 || j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			    }
				
			}
			System.out.println();
		}
		
		
	}

}
