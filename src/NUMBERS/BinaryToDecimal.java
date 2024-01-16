package NUMBERS;

import java.util.*;
public class BinaryToDecimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int binary = sc.nextInt();
		
		int n = 0;
		
		int ans = 0;
		while(binary > 0)
		{
			
			int rem = binary % 10;
			
		    ans=ans+(int)Math.pow(2, n)*rem;	
			n++;
		    binary = binary/10;
			
		}
		
		
		System.out.println(ans);
		
	}

}
