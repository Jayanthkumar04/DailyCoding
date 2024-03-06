package humancloudPatternPrinting;

public class Plus6 {

	public static void main(String[] args) {

		int n=5;
		
		int c=1;
		
		for(int i=0;i<n;i++)
		{
			if(i>=0 && i<=n/2)
			{
				
			for(int j=0;j<n;j++)
			{
		        
				System.out.print(c+"           ");
				c++;
			}
			if(i>=0 && i<=n/2)
			c=c+5;
			}
			
			else
			{   c=c-8;
				for(int j=0;j<n;j++)
				{
			        
					System.out.print(c+"           ");
					c++;
				}
			}
			
			System.out.println();
		}
	}

}
