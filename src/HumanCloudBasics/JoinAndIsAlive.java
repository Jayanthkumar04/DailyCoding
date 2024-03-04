package HumanCloudBasics;


class Demo1 implements Runnable 
{
	public void run()
	{
		try {
		}
		
		catch(Exception e)
		{
			
		}
	}
}

class Demoo2 implements Runnable 
{
	public void run()
	{
		try {
			
			
		}
		
		catch(Exception e)
		{
			
		}
	}
}

class Demo3 implements Runnable 
{
	public void run()
	{
		try {
			
			
		}
		
		catch(Exception e)
		{
			
		}
	}
}

public class JoinAndIsAlive {

	public static void main(String[] args) throws InterruptedException {

		
		Demo1 d1 = new Demo1();
		
		Demoo2 d2 = new Demoo2();
		
		Demo3 d3 = new Demo3();
		
		Thread t1 = new Thread(d1);

		Thread t2 = new Thread(d2);
		
		Thread t3 = new Thread(d3);
		
//		System.out.println(t1.getName());
		
		System.out.println(t1.isAlive());

		System.out.println(t2.isAlive());

		System.out.println(t3.isAlive());
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(t1.isAlive());

		System.out.println(t2.isAlive());

		System.out.println(t3.isAlive());
			
		t1.join();
		t2.join();
		t3.join();

		System.out.println(t1.isAlive());

		System.out.println(t2.isAlive());

		System.out.println(t3.isAlive());
	}

}
