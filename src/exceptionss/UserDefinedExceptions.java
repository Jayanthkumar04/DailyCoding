package exceptionss;

public class UserDefinedExceptions extends Exception{

	public UserDefinedExceptions(String msg)
	{
		
		super(msg);
		
	}
	public static void main(String[] args) {

		int sal=9000;
		
		try
		{
			if(sal < 10000)
			{
				UserDefinedExceptions ud = new UserDefinedExceptions("it is an error broo");
			    
				throw ud;
			
			}
			
			System.out.println("enjoyy......");
		}
		
		catch(UserDefinedExceptions e)
		{
			System.out.println(e.getMessage());
			
		}
	}

}