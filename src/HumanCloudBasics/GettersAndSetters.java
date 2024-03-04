package HumanCloudBasics;

class Example
{
	
    private int a=20;	
	
    void setA(int a)
    {
    	this.a=a;
    }
    
    int getA()
    {
    	return a;
    }
    
}

public class GettersAndSetters {

	public static void main(String[] args) {

		Example ob = new Example();
		
		
		ob.setA(50);
		
		
		System.out.println(ob.getA());
		
		
	}

}
