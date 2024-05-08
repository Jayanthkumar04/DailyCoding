package NUMBERS;

public class DecimalToBinary {

	public static void main(String[] args) {

		
		int decimal=10;
		
		int binary[]= new int[10];
		
		
		int i=0;
		while(decimal > 0)
		{
			
			binary[i] = decimal%2;
			
			decimal=decimal/2;
			
			i++;
			
		}
		
		for(int j=i-1;j>=0;j--)
		{
			
			System.out.print(binary[j]);
		}
		
		
		
		
	}

}
