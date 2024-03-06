package humancloudPatternPrinting;

public class HalfTriangle {

	public static void main(String[] args) {

		
		int n=5;
		
		int c=1;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c+"   ");
				c++;
			}
			
			System.out.println();
		}
		
	}

}
