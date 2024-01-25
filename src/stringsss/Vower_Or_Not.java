package stringsss;

import java.util.Scanner;

public class Vower_Or_Not {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		ch=Character.toLowerCase(ch);
		
		if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("given character is vowel");
			
		}else {
			System.out.println("not a vowel");
		}
		
		
	}

}
