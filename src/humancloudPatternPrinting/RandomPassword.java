package humancloudPatternPrinting;

import java.util.Scanner;

public class RandomPassword {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		String s = "afdsbasdfvdsf@#%";
		
		System.out.println("enter length");
		
		int n = sc.nextInt();
		
		String pass="";
		for(int i=0;i<n;i++)
		{
			int index = (int)(Math.random()*s.length());
			
			pass+=s.charAt(index);
			
			
		}
		
		System.out.println(pass);
		
		
	}

}
