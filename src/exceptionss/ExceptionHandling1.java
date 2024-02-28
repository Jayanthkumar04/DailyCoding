package exceptionss;

public class ExceptionHandling1 {

	public static void main(String[] args) throws Exception {

		int a=10,b=0;
		
		try
		{
			int ans = a/b;
			
			
		}
		
		catch(Exception e)
		{
//			e.printStackTrace();
			
//			System.out.println(e.getMessage());
		   

            System.out.println(e.toString());
		}
		
		finally
		{
			System.out.println("i will basically invoke to close the opened resources");
		}
		
		
		
	}

}
