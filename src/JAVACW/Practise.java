package JAVACW;

import java.util.*;

public class Practise {
	
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	while(true)
	{
	System.out.println("enter num");
	int num = sc.nextInt();
	System.out.println("enter option");
	int ch = sc.nextInt();
	
	switch(ch)
	{
	case 1:if(ch == 2) System.exit(0);
		   if(num > 0) System.out.println(num);
	       else System.out.println(-(num));
	break; 
	
	case 2:System.exit(0);
	}
	
	
	
	}
}

}
