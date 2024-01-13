package JAVACW;

class Calculator
{
	
	int a,b,res;
	
	void add(int a,int b)
	{
		this.a = a;
		this.b = b;
		
		System.out.println(a+b);
	}
	
	void sub(int a,int b)
	{
		this.a = a;
		this.b = b;
		
		System.out.println(a-b);
	}
	
}

public class CalciTest {

	public static void main(String[] args) {

		Calculator a=new Calculator();
		
		a.sub(10,8);
		
		
	}

}
