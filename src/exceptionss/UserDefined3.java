package exceptionss;

public class UserDefined3 extends Exception{

	UserDefined3(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {

		
		int age = 5;
		
		
		try
		{
			if(age <=10)
			{
				UserDefined3 ud = new UserDefined3("dont use phoneee");
				throw ud;
			}

			else
			{
				System.out.println("usee phonee limitedlyy");
			}
		}
		
		catch(UserDefined3 ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
		
	}

}
