package stringsss;

import java.util.Scanner;

public class CharAlphaOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		
		ch=Character.toLowerCase(ch);
		
		if(Character.isAlphabetic(ch))
		{
			System.out.println("given char is the character");
		}
		else
		{
			System.out.println("not a alphabet");
		}
		
	}

}
