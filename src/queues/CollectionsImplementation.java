package queues;

import java.util.*;

public class CollectionsImplementation {

	public static void main(String[] args) {

		
		Queue<Integer> q = new ArrayDeque<>();
		
		q.add(1);q.add(2);q.add(3);q.add(4);q.add(5);
		
		System.out.println(q);
		
		q.remove();
		
		System.out.println(q);
		
		q.offer(6);
		
		System.out.println(q);
		
		q.poll();
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q.element());
		
		
	}

}
