package heaps;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {

  
		int arr[] = {10,8,100,-1,-90};
		int k= 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i:arr)
        {
            pq.add(i);

            if(pq.size() > k) pq.remove();
        }

        System.out.println(pq.peek());
	}

}
