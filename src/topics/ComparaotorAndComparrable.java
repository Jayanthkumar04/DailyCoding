package topics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student implements Comparable<Student>
{
	int roll;
	String name;
	
	Student(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	
	public String toString()
	{
		return "student roll: "+roll+" name is: "+name;
		
	}

	@Override
	public int compareTo(Student that) {
		
		if(this.roll > that.roll)
		return 1;
		else return -1;
	}
}

public class ComparaotorAndComparrable {

	public static void main(String[] args) {


		Comparator<Integer> com = new Comparator<>()
				{

					@Override
					public int compare(Integer o1, Integer o2) {
						if(o1%10 > o2%10)
						return 1;
						else
							return -1;
					}
			
			       
			
			
				};
				
		Comparator<Student> com2 = new Comparator<>()
				{

					@Override
					public int compare(Student o1, Student o2) {
						
					if(o1.roll>o2.roll)
					{
						return 1;
					}
					else
					{
						return -1;
					}
					}
			
				};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(27);al.add(11);al.add(70);
		
		
		Collections.sort(al,com);
		
		System.out.println(al);
		
	    
		ArrayList<Student> stu = new ArrayList<>();
		
		stu.add(new Student(1,"jay"));

		stu.add(new Student(34,"yash"));		stu.add(new Student(16,"hari"));		stu.add(new Student(21,"jbool"));
		
		
		Collections.sort(stu,com2);
		
		for(Student st:stu)
		{
			System.out.println(st);
		}
		
	}

}
