package HumanCloudBasics;

class MsWord extends Thread
{
	
	
public void run()
{
	try
	{
		Thread t = new Thread();
		String name = t.getName();
		
		if(name.equals("typing"))
		{
		 	typingbro();
		}
		else if(name.equals("spell"))
		{
			spellbro();
		}
		else
		{
			savebro();
		}
	}
	catch(Exception e)
	{
		System.out.println("some problem occured");
		
	}
	
}	


public void typingbro()throws Exception
{
	for(int i=0;i<5;i++)
	{
		System.out.println("typing...");
	    Thread.sleep(2000);
	}
}

public void spellbro()throws Exception
{
	for(;;)
	{
		System.out.println("spell checking...");
	    Thread.sleep(2000);
	}
}

public void savebro()throws Exception
{
	for(;;)
	{
		System.out.println("auto saving...");
	    Thread.sleep(2000);
	}
}

}
public class DaemonExample {

	public static void main(String[] args) {

		MsWord m1=new MsWord();
		
		MsWord m2=new MsWord();
		
		MsWord m3=new MsWord();
		
		m1.setName("typing");
		m2.setName("spell");
		m3.setName("save");
		
		m2.setDaemon(true);
		m3.setDaemon(true);
		
		m2.setPriority(2);
		m3.setPriority(3);
		
		m1.start();
		m2.start();
		m3.start();
		
		
		
	}

}
