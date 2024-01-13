package JAVACW;

public class NestedGreatest {

	public static void main(String[] args) {
		
		int a = 10,b = 30,c = 5;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}else if(b>a) {
			           if(b>c) {
			        	   System.out.println(b);
			           }
			}else {
				System.out.println(c);
			}
			
			
		}

	}

}
