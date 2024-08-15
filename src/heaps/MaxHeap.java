package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(-1);
		System.out.println(pq);
		
		pq.add(10);
		System.out.println(pq);
		
		pq.add(20);
		System.out.println(pq);
		
		pq.add(7);
		System.out.println(pq);

		pq.add(70);
		System.out.println(pq);
		
		
		pq.add(-49);
		
		System.out.println(pq);
		
		
	}

}
