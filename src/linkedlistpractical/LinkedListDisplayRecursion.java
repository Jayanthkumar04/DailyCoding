package linkedlistpractical;

public class LinkedListDisplayRecursion {

	public static void displayRecursively(Node head)
	{
	    if(head == null) return;
	    
	    System.out.print(head.value+"-->");
	    
	    displayRecursively(head.next);
		
	}
	
	public static void displayRecursivelyReverse(Node head)
	{
	    if(head == null) return;
	    
	    
	    displayRecursivelyReverse(head.next);
		
	    System.out.print("<--"+head.value);
	    
	}
	public static void main(String[] args) {

		
		Node a = new Node(100);
		
		Node b= new Node (200);

		Node c= new Node (300);
		
		Node d= new Node (400);
		
		a.next = b;
		
		b.next = c;
		
		c.next = d;
		
		System.out.println("normal display");
		displayRecursively(a);
		
		
		System.out.println("\nreverse display");
		displayRecursivelyReverse(a);
	}

}
