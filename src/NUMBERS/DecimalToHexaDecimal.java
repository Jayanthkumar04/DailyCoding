package NUMBERS;

public class DecimalToHexaDecimal {

	public static void main(String[] args) {

		
		int decimal = 201;
		int i=0;
		char hexa[] = new char[10];
		while(decimal != 0)
		{
			
			int rem = decimal % 16;
			
			
			if(rem < 10)
			{
				
				hexa[i] = (char)(rem+48);
				i++;
				
			}
			
			else
				
			{
				
				hexa[i]=(char)(rem+55);
				i++;
				
			}
			
			decimal = decimal/16;
			
			
		}
		
		
		for(int j=i-1;j>=0;j--)
		{
			System.out.print(hexa[j]);
		}
		
		
	}

}
