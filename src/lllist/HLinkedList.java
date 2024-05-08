package lllist;

public class HLinkedList {

	public static class Node
	{   
		int data;
		
		Node next;
		Node(int x)
		{
			data=x;
			
		}
	
	}
	
	public static void main(String[] args) {

		Node a = new Node(10);

		Node b = new Node(20);
		
		Node c = new Node(30);
		
		Node d = new Node(40);
		
		a.next=b;
		
		b.next=c;
		
		c.next=d;
		
		System.out.println(b.data);
		
		System.out.println(a.next.data);
				
		Node temp = a;
		
		for(int i=0;i<4;i++)
		{
			System.out.print(temp.data+"  ");
		    
			temp=temp.next;
		}
		
		Node temp2 = a;
		
		System.out.println();
		while(temp2 != null)
		{
			System.out.print(temp2.data+"  ");
			
			temp2=temp2.next;
		}
		
		
	}

}
