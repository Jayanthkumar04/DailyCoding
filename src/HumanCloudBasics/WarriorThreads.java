package HumanCloudBasics;


class w implements Runnable
{
	String res1="sur";

	String res2="pushu";
	
	String res3="brahma";
	
	public void run()
	{
		try
		{
		Thread t = new Thread();
		
		String name = t.getName();
		
		if(name.equals("rama"))
		{
			ramaDesc();
		}
		else if(name.equals("ravan"))
		{
			ravanDesc();
		}
		
		
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void ramaDesc() throws Exception
	{
		Thread.sleep(2000);
		
		synchronized(res1)
		{
			System.out.println("ram occupited "+res1);
		   Thread.sleep(2000);
		   
		   synchronized(res2)
		   {
			   System.out.println("ram occupied "+res2);
			   Thread.sleep(2000);
			   
			   synchronized(res3)
			   {
				   System.out.println("ram occupied "+res3);
				   Thread.sleep(2000);
			   }
		   }
		}
		
		
	}
	
	public void ravanDesc() throws Exception
	{
		
Thread.sleep(2000);
		
		synchronized(res1)
		{
			System.out.println("ravan occupited "+res1);
		   Thread.sleep(2000);
		   
		   synchronized(res2)
		   {
			   System.out.println("ravan occupied "+res2);
			   Thread.sleep(2000);
			   
			   synchronized(res3)
			   {
				   System.out.println("ravan occupied "+res3);
				   Thread.sleep(2000);
			   }
		   }
		}
		
	
		
	}
	
	
}
public class WarriorThreads {

	public static void main(String[] args) {

		w ww= new w();
		
		Thread t1 = new Thread(ww);
		
		Thread t2 = new Thread(ww);
		
		t1.setName("rama");
		
		t2.setName("ravan");
		
		t1.start();
		
		t2.start();
		
	}

}
