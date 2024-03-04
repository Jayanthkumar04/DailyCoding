package HumanCloudBasics;


class Demo
{
	
	int i=90;
	
	void inDemo()
	{
		System.out.println("in Demo");
	}
	
}

class Demo2 extends Demo
{
	int i=99;
	
	
	void displayDemo2()
	{
		System.out.println(super.i);
	}
	
	
	
}
public class Superr {

	public static void main(String[] args) {

		Demo2 d2 = new Demo2();
		
		d2.displayDemo2();
		
		A a= new A();
		
		
		
		
	}

}
