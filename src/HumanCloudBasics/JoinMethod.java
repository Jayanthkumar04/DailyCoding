package HumanCloudBasics;


class Demo11 extends Thread 
{  
	public void run()
	{
		try {
			for(int i=0;i<3;i++)
			{
				System.out.println("child thread "+i);
			    Thread.sleep(2000);
			}
			
		}
		
		catch(Exception e)
		{
			
		}
	}
}
 


public class JoinMethod{


	public static void main(String[] args) throws InterruptedException{

//	    mThread = Thread.currentThread();
		
		
		Demo11 d1 = new Demo11();
		
		


		d1.start();
		
		d1.join();
		try
		{
		for(int i=0;i<3;i++)
		{
			System.out.println("main thread "+i);
		    Thread.sleep(2000);
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}

