package HumanCloudBasics;

import java.util.Scanner;

public class Cmd {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
       System.out.println("num");
       
       int a=sc.nextInt();
       
       
      System.out.println("char");
      
      char ch = sc.next().charAt(0);
      
	   sc.nextLine();
      System.out.println("string");
       
      String s=sc.nextLine();
      
      System.out.println(a+"  "+ch+"  "+s);
	}

}
