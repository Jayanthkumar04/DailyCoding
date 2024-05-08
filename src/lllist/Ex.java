package lllist;


class Warrior implements Runnable
{
	String s1 ="one";
	String s2="two";
	String s3="three";
	public void run()
	{
		try
		{
		
			Thread t = Thread.currentThread();
			
			String name = t.getName();
		
			
			if(name.equals("rama"))
			{
				ramaAcc();
			}
			else
			{
				ravanaAcc();
			}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	public void ramaAcc() throws Exception
	{
		Thread.sleep(2000);
		
		synchronized(s1)
		{
			
			System.out.println("rama and "+s1);
			Thread.sleep(2000);			
			
			synchronized(s2)
			{
				System.out.println("rama and "+s2);
				Thread.sleep(2000);
				
				synchronized(s3)
				{
					System.out.println("rama and "+s3);
				}
			}
		}
	}
	
	public void ravanaAcc()throws Exception
	{
        Thread.sleep(2000);
		
		synchronized(s3)
		{
			
			System.out.println("ravana and "+s3);
			Thread.sleep(2000);
			synchronized(s2)
			{
				System.out.println("ravana and "+s2);
				Thread.sleep(2000);
				synchronized(s1)
				{
					System.out.println("ravana and "+s1);
				}
			}
		}
	}
}
public class Ex {

	public static void main(String args[])
	{
		
		Warrior w = new Warrior();
		
		Thread t1 = new Thread(w);
		
		Thread t2 = new Thread(w);
	
		t1.setName("rama");
		t2.setName("ravana");
		t1.start();
		
		t2.start();
		
	}
}
