package stringsPractise;

import java.util.Scanner;

public class UpdateOddPosition {

	public static void main(String[] args) {

		
		System.out.println("enter strirng");
		
		Scanner sc= new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder(sc.nextLine());
		
		for(int i=0;i<sb.length();i++) {
			
			if(i%2 != 0) {
				sb.setCharAt(i,'#');
			
			}
			
		}
		
	System.out.println(sb);
		
	}

}
