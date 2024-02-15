package collectionss;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queuess {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue();
		
		
		Queue q1 = new PriorityQueue();
		
		
		q1.add(10);q1.add(20);q1.add(30);
		
		
		System.out.println(q1);
		
		
		q1.offer(60);
		
		System.out.println(q1);
		
		
		System.out.println(q1.element());
		
		
		System.out.println(q1.peek());
		
		
	}

}
