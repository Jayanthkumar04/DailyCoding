package humanCloudFilesConcepts;

class parent
{
	public void display(int a,int b)
	{
	System.out.println("parrenttt");	
	}
}

class child extends parent
{
	public void display(float a,float b)
	{
		
		System.out.println("child");
	}
}
public class See {

	public static void main(String[] args) {

		child ch = new child();
		
		ch.display(5.0f, 6.0f);
		
		
		
	}

}
