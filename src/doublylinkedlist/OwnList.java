package doublylinkedlist;


class DoubleLinkedList
{
	
	Node head;
	
	Node tail;
	
	int size = 0;
	
	void insertAtTail(int data)
	{
		
		Node temp = new Node(data);
		
		
		if(head == null) head = tail = temp;
		
		else {
			
			
			
			tail.next = temp;
			
			temp.prev = tail;
			
			tail = temp;
		}
		
		size++;
		
	}
	
	void display()
	{
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.data+"-->");
			
			temp = temp.next;
		}
		
	}
	
	void deleteAt(int index)
	{
		Node x = head;Node y=head;
		
		for(int i=0;i<index-1;i++)
		{
			x=x.next;
		}
		
		y=x.next.next;
		
		
		x.next = y;
		
		y.prev = x;
	}
}
public class OwnList {

	public static void main(String[] args) {

		DoubleLinkedList dl = new DoubleLinkedList();
		
		
		dl.insertAtTail(10);
		
		dl.insertAtTail(20);

		dl.insertAtTail(30);
		
		dl.insertAtTail(40);
		
		dl.insertAtTail(50);
		
		dl.display();
		
		dl.deleteAt(2);

		dl.display();
	}

}
