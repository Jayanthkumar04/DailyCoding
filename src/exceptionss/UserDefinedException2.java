package exceptionss;

public class UserDefinedException2 extends Exception {

	
	public UserDefinedException2(String mess)
	{
		
		super(mess);
	
	}
	public static void main(String[] args) {

		try
		{
			int age = 19;
			
			if(age < 18)
			{
				UserDefinedException2  ob= new UserDefinedException2("ur not eligible to vote broo");
				
				throw ob;
				
			}
			
			System.out.println("ur eligible to vote vote to me");
		}
		
		
		
		catch(UserDefinedException2 ue)
		{
			System.out.println(ue.getMessage());
		}
		
		
		
	}

}
