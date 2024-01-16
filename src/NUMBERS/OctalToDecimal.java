package NUMBERS;

import java.util.Scanner;

public class OctalToDecimal
{
	public static void main(String args[])
	{      
		System.out.println("hello");
		//scanner class object creation
		Scanner sc = new Scanner(System.in);    
		//input from user
		System.out.print("Enter a octal number : ");
		int octal = sc.nextInt();
		//Declare variable to store decimal number  
		int decimal = 0;
		//Declare variable to use in power		
		int n = 0;  
		//writing logic for the conversion
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, n);  
			octal = octal/10;  
			n++;  
		}
		System.out.println("Decimal number : "+decimal); 
		   
	}
}