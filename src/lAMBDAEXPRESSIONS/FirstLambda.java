package lAMBDAEXPRESSIONS;


@FunctionalInterface
interface Cab
{
	public void bookCab();
	
}

//class Ola implements Cab
//{
//
//	public void bookCab() {
//
//		System.out.println("cab has been booked.......");
//	}
//	
//}

@FunctionalInterface
interface phone
{
	public String Samsung(String model,int price);
}


public class FirstLambda {

	public static void main(String[] args) {

		
//		Cab cab = new Ola();
//		
//		cab.bookCab();
          		
		Cab cab =()->System.out.println("cab has been booked......");
		
		cab.bookCab();
		
		
		phone ph = (a,b)->{
			
			System.out.println("model is "+a+" price is "+b);
			return ("this is final price");
		};
		
		
		ph.Samsung("x10",20000);
		
	}

}
