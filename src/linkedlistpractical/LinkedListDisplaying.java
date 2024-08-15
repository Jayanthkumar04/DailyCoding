package linkedlistpractical;

public class LinkedListDisplaying {
	
	public static void display(Node head)
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.value+"-->");
			
			temp=temp.next;
			
		}
		
		
	}

	public static void main(String[] args) {

		Node a = new Node(100);
		
		Node b= new Node (200);

		Node c= new Node (300);
		
		Node d= new Node (400);
		
		a.next = b;
		
		b.next = c;
		
		c.next = d;
		
		display(a);
		
		
	}

}
