package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInAnArrray {

	public static void main(String[] args) {

		int arr[] = {10,-2,8,9,10,11,2};
		
		int k = 3; //3rd smallest
		
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:arr)
        {
            pq.add(i);

            if(pq.size() > k) pq.remove();
        }

        System.out.println(pq.peek());
	}

}
