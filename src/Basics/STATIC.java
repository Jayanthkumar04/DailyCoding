package Basics;


class variable 
{
	static int count=0;
	
	variable()
	{
		
		System.out.println("count is: "+count);
		
		count++;
		
	}
	
}
public class STATIC {

	public static void main(String[] args) {

		variable v1= new variable();
		
		variable v2= new variable();

		variable v3= new variable();

	}

}
