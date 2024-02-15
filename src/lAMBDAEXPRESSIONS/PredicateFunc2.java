package lAMBDAEXPRESSIONS;

import java.util.ArrayList;
import java.util.function.Predicate;

class employee
{
	
	String name;
	int sal;
	int experience;
	
	employee(String name,int sal,int experience)
	{
		this.name=name;
		this.sal=sal;
		this.experience=experience;
	}
	
	
	
}
public class PredicateFunc2 {

	public static void main(String[] args) {

		
		Predicate<employee> pd = (emp)->(emp.sal>2000 && emp.experience >2);
		
		
		ArrayList<employee> al = new ArrayList<employee>();
		
		al.add(new employee("jay",1000,2));

		al.add(new employee("hari",2000,20));
		al.add(new employee("yash",5000,10));
		al.add(new employee("dinesh",6000,5));

		
		for(employee e:al)
		{
			if(pd.test(e))
			System.out.println(e.name+"     "+e.experience);
		}
		
		
		
	}

}
