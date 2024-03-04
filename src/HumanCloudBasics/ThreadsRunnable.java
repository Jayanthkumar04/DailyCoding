package HumanCloudBasics;


class One implements Runnable
{
	public void run()
	{
		try
		{
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		} 
		System.out.println("hello this is one methoddd");
		
	}
	
	
}

class Two implements Runnable
{
	
	public void run()
	{
		System.out.println("hello this is two methoddd");
	}
	
}

public class ThreadsRunnable {

	public static void main(String[] args) {

		
		One o = new One();
		
		Two t = new Two();
		
		Thread t1 = new Thread(o);

		Thread t2 = new Thread(t);
		
		t1.start();
		
		t2.start();
		
		
		
	}

}
