package queues;

import java.util.*;
public class DisplayByCollections {

	public static void main(String[] args) {

		
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
		
		Queue<Integer> q1 = new LinkedList<>();
		
		while(q.size() > 0)
		{
		
			System.out.print(q.peek()+"  ");
			q1.add(q.remove());
			
		}
		
		
		System.out.println(q);
		
		System.out.println(q1);
		
	}

}
