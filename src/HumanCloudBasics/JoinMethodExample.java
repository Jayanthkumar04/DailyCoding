package HumanCloudBasics;

class Medical extends Thread
{

	public void run()
	{
		try
		{
		System.out.println("medical started");
		
		Thread.sleep(1000);
		
		System.out.println("medical ended");
	}
	
		catch(Exception e)
		{
			
		}
	}
	
	
}

class Test extends Thread
{

	public void run()
	{
		try
		{
		System.out.println("Test started");
		
		Thread.sleep(1000);
		
		System.out.println("Test ended");
	}
	
		catch(Exception e)
		{
			
		}
	}
	
	
}

class Officer extends Thread
{

	public void run()
	{
		try
		{
		System.out.println("officere examined");
		
		Thread.sleep(1000);
		
		System.out.println("officerr issued license");
	}
	
		catch(Exception e)
		{
			
		}
	}
	
	
}
public class JoinMethodExample {

	public static void main(String[] args) throws InterruptedException{
		
		
		Medical m = new Medical();
		
		Officer o = new Officer();
		
		Test t = new Test();
		
		
		
		m.start();
		
		m.join();
		
		t.start();
		
		t.join();
		
		o.start();
		
		o.join();
		
		
		

	}

}
