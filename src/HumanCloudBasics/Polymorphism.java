package HumanCloudBasics;


class plane
{
	void takeOff()
	{
		System.out.println("plane takeoff");
	}
	
	void land()
	{
		System.out.println("plane landing");
	}
	
}

class fighterplane extends plane
{
	void takeOff()
	{
		System.out.println("FIGHTER plane takeoff");
	}
	
	void land()
	{
		System.out.println("FIGHTER plane landing");
	}
	
}

class passengerplane extends plane
{
	
	void takeOff()
	{
		System.out.println("PASSENGER plane takeoff");
	}
	
	void land()
	{
		System.out.println("PASSENGER plane landing");
	}
	
}

class Airport
{
public void permit(plane ref)
{
ref.takeOff();

ref.land();
}

}
public class Polymorphism {

	
	
	public static void main(String[] args) {

		
		passengerplane pp = new passengerplane();

		fighterplane fp = new fighterplane();
		
		Airport a = new Airport();

		
		a.permit(fp);
		
		a.permit(pp);
		
		
	}

}
