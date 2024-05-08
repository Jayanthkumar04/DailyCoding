package lllist;

public class HLinkedList2 {

	
	public static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data  = data;
		}
		
	}
	
	public static class LinkedList
	{
		Node head = null;
		
		Node tail = null;
		
		public void add(int data)
		{
			Node a = new Node(data);
			
			if(head == null)
			{
				head = a;
				tail = a;
			}
			else
			{
				tail.next=a;
				tail=a;
			}
		}
		
		public void display()
		{
			Node temp = head;
			
			while(temp != null)
			{
				System.out.print(temp.data+"  ");
				
				temp = temp.next;
			}
		}
		
		public int size()
		{
			Node temp = head;
			
			int count = 0;
			while(temp != null)
			{
			count++;
			
			temp=temp.next;
			}
			System.out.println();
			
			System.out.println("size is:"+count);
		return count;
		}
		
		public void insertFirst(int data)
		{
			Node temp = new Node(data);
			
			if(head == null)
			{
				head=tail=temp;
			}
			else
			{
				temp.next=head;
				head=temp;
			}
			
		}
		
		public void getElement(int index)
		{
			Node temp =head;
			
			for(int i=0;i<index;i++)
			{
				temp = temp.next;
			}
			
			System.out.println(temp.data);
		}
		
		
		public void insert(int index,int data)
		{
			Node t = new Node(data);
			
			Node temp =head;
			
			
			if(index == size())
			{
				add(data);
				
				return;
			}
			if(index == 0)
			{
				insertFirst(data);
				return;
			}
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
			
			t.next =temp.next;
			
			temp.next=t;
		}
		
		public void delete(int index)
		{
			Node temp =head;
			
			for(int i=0;i<index-1;i++)
			{
				temp = temp.next;
			}
			
			temp.next = temp.next.next;
		}
		
	}
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.add(10);
		
		ll.add(20);
		
		ll.add(50);
		
		ll.add(70);
		
		ll.display();
		
		ll.size();
		
		ll.insertFirst(200);

		ll.display();
		
		ll.insert(3,777);
System.out.println();
		ll.display();
		
		ll.insert(0, 187);
		System.out.println();
		ll.display();
	System.out.println();
		ll.getElement(2);
	
		ll.delete(2);
		
		System.out.println();
		
        ll.display();
		
		ll.size();
		
		
		
	}

}
