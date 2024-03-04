package collectionss;

import java.util.LinkedList;

public class LINKEDLIST {

	public static void main(String[] args) {

		LinkedList<Integer> ll =  new LinkedList<>();
		
		
		ll.add(30); ll.add(50);  ll.add(90);
		
		System.out.println(ll);

		ll.addFirst(1);

		System.out.println(ll);

		ll.addLast(999);
		
		System.out.println(ll);

		System.out.println(ll.get(0));
		
		System.out.println(ll.isEmpty());
		
		
	}

}
