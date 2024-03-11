package HumanCloudBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
	int age;
	
	String name;
	
	Student(int age,String name)
	{
		
		this.name=name;
		this.age=age;
		
		
	}
	
	public String toString()
	{
		return "student age "+age+" name "+name;
		
	}
	
	
}
public class Comparator2 {

	public static void main(String[] args) {
		

		

		ArrayList<Student> al = new ArrayList<>();

		Comparator<Student> cm = new Comparator<Student>()
		{

			public int compare(Student o1, Student o2) {
			
				
				if(o1.age > o2.age)
					return 1;
			
				else
					return -1;
			}
	
	
			
	
		};
		
		al.add(new Student(22,"jayanth"));
		
		al.add(new Student(81,"mannan"));
		
		al.add(new Student(19,"dinesh"));
		
		Collections.sort(al,cm);
		
		
		for(Student s :al)
		{
			System.out.println(s);
		}
		
		
	}

}
