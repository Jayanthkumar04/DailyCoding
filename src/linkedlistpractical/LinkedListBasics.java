package linkedlistpractical;


class Node
{
	int value;
	
	Node next;
	
	Node(int value)
	{
		this.value = value;
	}
}
public class LinkedListBasics {

	public static void main(String[] args) {

		
		
		Node a = new Node(10);
		
		Node b = new Node(20);
		
		Node c = new Node(30);
		
		Node d = new Node(40);
		
		
		System.out.println(a);
		
		System.out.println(a.value);
		
		System.out.println(a.next);
		//linking
		
		a.next = b;
		
		b.next = c;
		
		c.next = d;
		
		System.out.println(a.next.value);
		
	}

}
