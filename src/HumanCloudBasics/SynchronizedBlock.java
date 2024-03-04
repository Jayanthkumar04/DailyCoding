package HumanCloudBasics;

class Hall implements Runnable
{
//	public void  run()
//	{
//		
//		try
//		{
//			Thread t = Thread.currentThread();
//			
//			String name = t.getName();
//			
//			System.out.println(name+" entered the hall");
//			
//			t.sleep(3000);
//			
//			System.out.println(name+" staying in the hall");
//			
//            t.sleep(3000);
//			
//			System.out.println(name+" exited the hall");
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("error occurred");
//		}
//		
//		
//	}

	public synchronized void  run()
	{
		
		try
		{
			Thread t = Thread.currentThread();
			
			String name = t.getName();
			
			System.out.println(name+" entered the hall");
			
			t.sleep(3000);
			
			System.out.println(name+" staying in the hall");
			
            t.sleep(3000);
			
			System.out.println(name+" exited the hall");
			
		}
		catch(Exception e)
		{
			System.out.println("error occurred");
		}
		
		
	}
	
}
public class SynchronizedBlock {

	public static void main(String[] args) {

		Hall h1 = new Hall();
		
		
		Thread t1 = new Thread(h1);

		Thread t2 = new Thread(h1);
		
		Thread t3 = new Thread(h1);
		
	    t1.setName("boy");
	    
	    t2.setName("girl");
	    
	    t3.setName("other");
	    
	    t1.start();
	    
	    t2.start();
	    
	    t3.start();
	}

}
