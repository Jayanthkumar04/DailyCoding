package HumanCloudBasics;

public class Threads2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.out.println("numbers printing");
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			
			Thread.sleep(100);
		}
		
		System.out.println("ended");
		
		System.out.print("loading");
		
		for(int i=0;i<3;i++)
		{
			System.out.print(".");
			Thread.sleep(500);
		}
		
	}

}
