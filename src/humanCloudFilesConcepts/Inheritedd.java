package humanCloudFilesConcepts;

class Animal
{
	
}

class Tiger extends Animal
{
	
}

class Demo
{
	public Animal fun()
	{
		System.out.println("btm");
		
		Animal a = new Animal();
		
		return a;
	}
	
}

class Demo2 extends Demo
{
	public Tiger fun()
	{
		System.out.println("vijayy");
		
		Tiger t = new Tiger();
		
		return t;
	}
}


public class Inheritedd {

	public static void main(String[] args) {

		Demo2 d2 = new Demo2();
		
		d2.fun();
		
	}

}
