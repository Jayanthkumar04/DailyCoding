package HumanCloudBasics;

class dthread extends Thread
{
	
	public void run()
	{
		System.out.println("this is daemon thrreadd");
	}
	
}

public class Daemonthread {

	public static void main(String[] args) {

		System.out.println("this is main");
		
		dthread d = new dthread();
		
		d.setDaemon(true);
		
		
		d.start();
		
		
		
	}

}
