package HumanCloudBasics;

interface Y
{
	int i=10;
	
	public void display();
	
}

class Z implements Y
{
	
public void display()
{
	System.out.println("b methoddd");
	
	System.out.println(i);
	
//	i=90;   //it cannot be changed as variable inside inteface are final
	
}
	
}


public class Interfacess {

	public static void main(String[] args) {

	  Z z =new Z();
	  
	  z.display();
	  
	  
		
		
	}

}
