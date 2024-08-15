package doublylinkedlist;

class Node
{
	int data;
	
	Node next;
	
	Node prev;
	
     Node(int data)
	{
		this.data = data;
	}
}


public class Implementation {

	
	public static void main(String[] args) {

		Node a = new Node(1);
		
		Node b = new Node(2);
		
		Node c = new Node(3);
		
		a.next = b;
		
		b.prev = a;
		
		b.next = c;
		
		c.prev = b;
		
		System.out.println(a.data);
		
		System.out.println(a.next.data);
		
		System.out.println(b.prev.data);
		
		
		
		
	}

}
