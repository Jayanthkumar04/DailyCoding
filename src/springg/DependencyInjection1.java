package springg;

interface Sim
{
	public void simName();
	
	
}

class Airtel implements Sim
{
	public void simName()
	{
		System.out.println("i am airtel");
	}
	
}
class Idea implements Sim
{
	public void simName()
	{
		System.out.println("i am idea");
	}
}
class Jio implements Sim
{
	public void simName()
	{
		System.out.println("i am jio");
	}
}

class Mobile
{
	Sim ar = null;
	 Mobile(Sim s)
	{
		ar =s;
	   ar.simName();
	}
	 
	
}
public class DependencyInjection1 {

	public static void main(String[] args) {

		Mobile m1 = new Mobile(new Airtel());
		
		
	}

}
