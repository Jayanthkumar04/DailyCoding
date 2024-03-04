package HumanCloudBasics;

class prac extends Thread
{
	
	public void run()
	{
		try
		{
			System.out.print("prrac 1 startedd");
		
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
			    Thread.sleep(600);
			}
			
		System.out.println("prac1 ended");
		  
		Thread.sleep(3000);
		System.out.println("===============");
		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
	}
	
}

class prac2 extends Thread
{
	public void run()
	{
		try
		{
			System.out.print("prrac 2 startedd");
		
			for(int i=0;i<3;i++)
			{
				System.out.print(".");
			    Thread.sleep(600);
			}
		   
		}
		
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println("prac 2 ended..");
		
	}
}


public class Threads3 {

	public static void main(String[] args) {

		
		prac p = new prac();
		prac2 p2 = new prac2();
		
		p.start();

		p2.start();
		
	}

}
