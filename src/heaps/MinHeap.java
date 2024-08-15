package heaps;

import java.util.PriorityQueue;

public class MinHeap {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(-1);
		System.out.println(pq);
		
		pq.add(10);
		System.out.println(pq);
		
		pq.add(20);
		System.out.println(pq);
		
		pq.add(90);
		System.out.println(pq);
		
		pq.add(-49);
		
		System.out.println(pq);
		
		
	}

}
