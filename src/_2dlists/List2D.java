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

	 
	}

}
