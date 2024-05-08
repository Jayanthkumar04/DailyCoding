package launch;

class Queue
{
	int x;
	
	boolean in_x = false;
	
	synchronized public void put(int i)
	{
		try
		{
			if(in_x == true)
			{
				wait();
			}
			else
			{
				x=i;
				System.out.println("i have put x: "+x);
				in_x=true;
				notify();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	synchronized public void get()
	{
		try
		{
			if(in_x == false)
			{
				wait();
			}
			
			else
			{
			System.out.println("taken from x :"+x);
			
			in_x=false;
			
			notify();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class producer extends Thread
{
	Queue a;
	
	public producer(Queue m)
	{
		a=m;
	}
	
	public void run()
	{
		int j=0;
		while(true)
		{
			a.put(j++);
		}
	}
}

class consumer extends Thread
{
	Queue b;
	public consumer(Queue n)
	{
		b=n;
	}
	public void run()
	{
		while(true)
		{
			b.get();
		}
	}
}
public class Producer_Consumer {

	public static void main(String[] args) {

		Queue q = new Queue();
		
		producer p = new producer(q);
		
		consumer c = new consumer(q);
		
		p.start();
		
		c.start();
		
	}

}
