package humancloudPatternPrinting;

import java.time.LocalDate;

public class FactWithoutBigInteger {

	public static void main(String args[])
	{
		
		int arr[] = new int[100];
		
		int c = 0;
		
		int n = 10;
		
		for(int k=1;k<=n;k++)
		{
		
			for(int i=0;i<arr.length;i++)
			{
				int res = arr[i]*k+c;
				
				arr[i]=res%10;
				
				c=res/10;
				
			}
		}
		
	   LocalDate ld = LocalDate.of(2001, 8, 4);
	   
	   
	   System.out.println(ld.getDayOfMonth());
		
	   System.out.println(ld.getMonth());
	   
	   System.out.println(ld.getDayOfWeek());
	   
	   System.out.println(ld.getMonthValue());
	}
}
