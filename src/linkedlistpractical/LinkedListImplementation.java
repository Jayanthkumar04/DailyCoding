package linkedlistpractical;


class SingleLinkedList
{
	
	Node head;
	
	Node tail;
	
	int size;
	
	void insertAtEnd(int data)
	{
		Node temp = new Node(data);
		if(head == null)
		{
			
			head = tail = temp;
			size++;
		}

		else
		{
			
			tail.next=temp;
			
			tail = temp;
			
			size++;
		}
		
	}
	
	void display()
	{
		
		Node temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.value+"-->");
			
			temp = temp.next;
		}
		
	}
	
	void size()
	{
	
		System.out.println("\nsize is "+size);
	
	}
	
	void insertAtHead(int data)
	{
		Node temp = new Node(data);
		
		if(head == null)
		{
			head=tail=temp;
			size++;
		}
		else
		{
			temp.next=head;
			
			head=temp;
			
			size++;
		}
	}
	
	void insert(int index,int data)
	{
		
		if(index == 0)
		{
		  insertAtHead(data);
		  return;
		}
		
		else if(index == size)
		{
			insertAtEnd(data);
		}
		
		else if(index > size)
		{
			System.out.println("invalid index");
			return;
		}
		
		Node temp = new Node(data);
		
		
		
		Node x = head;
		
		for(int i=0;i<index-1;i++)
		{
			
			x=x.next;
			
		}
		
		temp.next = x.next;
		
		x.next = temp;
		
        size++;
		
		
	}
	
	void get(int index)
	{
		if(index < 0 || index >=size)
		{
			System.out.println("invalid index");
			
			return;
		}
		
		Node temp = head;
		
	    for(int i=0;i<index;i++)
	    {
	    	temp = temp.next;
	    }
	    
	    System.out.println(temp.value);
	    
	    
		
	}
	
	Node partition(int x)
	{
		
		Node tempA = new Node(-1);
		
		Node tempB = new Node(-1);
		
		Node temp = head;
		
		
		Node ta= tempA;
		
		Node tb = tempB;
		
		while(temp != null)
		{
			
			if(temp.value < x)
			{
				ta.next = temp;
				
				ta = ta.next;
				
			}
			
			else
			{
				tb.next = temp;
				
				tb=tb.next;
				
			}
			
			temp = temp.next;
			
		}
		
		tb.next = null;
		
		tempA=tempA.next;
		
		tempB=tempB.next;
				
		ta.next=tempB;
		
		return tempA;
		
	}
	
	
}
public class LinkedListImplementation {

	public static void main(String[] args) {

		SingleLinkedList list = new SingleLinkedList();
		
		list.insertAtEnd(100);
		
		list.insertAtEnd(5);
		
		list.display();
		
		list.size();
		
		list.insertAtHead(1);
        
		list.display();
		
		list.size();
	
		
		list.insert(2,77);
	
	    list.display();
		
		list.size();
		
		list.get(2);
		
		
	}

}
