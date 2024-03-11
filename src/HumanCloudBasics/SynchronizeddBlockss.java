package HumanCloudBasics;

class DemoHuman implements Runnable
{
	public void run()
	{
		try
		{
			synchronized(this)
			{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
			   
				Thread.sleep(1000);
			}
			
			}	
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
}
public class SynchronizeddBlockss {

	public static void main(String[] args) {

		
		DemoHuman dm = new DemoHuman();
		Thread t1 = new Thread(dm);
		Thread t2 = new Thread(dm);
		
	    t1.start();
	    t2.start();
	    
		
	}

}
