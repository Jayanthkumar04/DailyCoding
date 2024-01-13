package JAVACW;
import java.util.*;
public class Triangle {
	
	public static void main(String args[])
	{
Scanner sc = new Scanner(System.in);
System.out.println("enter a,b,c sides");	
byte a = sc.nextByte(); 
byte b = sc.nextByte(); 
byte c = sc.nextByte(); 
	
if(a + b > c && b + c > a && c + a > b)
{
	System.out.println("it is a triangle");
}else {
	System.out.println("it is not a triangle");
}

	}
}
