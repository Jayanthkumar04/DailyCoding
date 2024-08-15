package _2dlists;

import java.util.*;
public class List2D {

	public static void main(String[] args) {
		
		
        List<List<Integer>> al=new ArrayList<>();

        List<Integer> a=new ArrayList<>();

a.add(10);a.add(20);a.add(30);

List<Integer> b=new ArrayList<>();

b.add(1);b.add(2);b.add(3);


al.add(a);al.add(b);


for(int i=0;i<al.size();i++)
{
	List<Integer> temp = al.get(i);
	
	for(int j=0;j<temp.size();j++)
	{
		System.out.print(temp.get(j)+"     ");
	}
	System.out.println();
		
}


System.out.println("------------------------------");

	 
ArrayList<ArrayList<Integer>> al2 = new ArrayList<>();


ArrayList<Integer> l1 = new ArrayList<>();
l1.add(10);l1.add(20);l1.add(30);

ArrayList<Integer> l2 = new ArrayList<>();
l2.add(90);l2.add(80);l2.add(70);

ArrayList<Integer> l3 = new ArrayList<>();
l3.add(32);

al2.add(l1);al2.add(l2);al2.add(l3);

for(int i=0;i<al2.size();i++)
{
	ArrayList<Integer> temp = al2.get(i);
	
	for(int j=0;j<temp.size();j++)
	{
		System.out.print(temp.get(j)+"       ");
	}
	System.out.println();
}


	}

}
