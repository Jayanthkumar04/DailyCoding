package JAVACW;
import java.util.*;
public class ProfitLoss {
	
public static void main(String args[])
{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("cp");
	
	int cp = sc.nextInt();
	
	System.out.println("sp");
	
	int sp = sc.nextInt();
	
	if(sp > cp)
	{
		System.out.println("seller made profit");
		System.out.println("profit he made is: "+(sp-cp));
	
	}else if(sp < cp){
		System.out.println("seller made Loss");
		System.out.println("profit he made is: "+(cp-sp));
		
	}else {
		System.out.println("no profit no loss");
	}
	
	
}

}
