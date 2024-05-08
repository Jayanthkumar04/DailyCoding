package springg;

interface Sim2
{
	public void simName();
	
	
}

class Airtel2 implements Sim2
{
	public void simName()
	{
		System.out.println("i am airtel");
	}
	
}
class Idea2 implements Sim2
{
	public void simName()
	{
		System.out.println("i am idea");
	}
}
class Jio2 implements Sim2
{
	public void simName()
	{
		System.out.println("i am jio");
	}
}

class Mobile2
{
	Sim2 ar = null;
	
	public void getSim(Sim2 s)
	{
		ar=s;
		
		ar.simName();
	}
	 
	
}
public class DependencyInjection2 {

	public static void main(String[] args) {

		Mobile2 m1 = new Mobile2();
		
		m1.getSim(new Jio2());
		
	}

}
