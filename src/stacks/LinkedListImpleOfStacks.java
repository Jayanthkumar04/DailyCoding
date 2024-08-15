package stacks;


//import stacks.ArrayImpleOfStacks.Stack;


class Node
{
	int data;
	
	Node next;
	
	Node(int data)
	{
		this.data = data;
	}
}

class StackUser
{
	
	int size = 0;
	
	Node head = null;
	
	void push(int data)
	{
		
		Node temp = new Node(data);
		
		if(head == null)
		{
			head = temp;
		}
		else {
			
			temp.next = head;
			
			head = temp;
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
	
	void pop()
	{
		head = head.next;
		
		size--;
	}
	
	void peek()
	{
		System.out.println(head.data);
	}
	
	
	
}
public class LinkedListImpleOfStacks {

	
	
	public static void main(String[] args) {

		StackUser st = new StackUser();
		
		st.push(10);
		
		st.push(20);
		
		st.push(30);
		
		st.push(40);
		
		st.push(50);
		
		st.push(60);
		
	    st.display();
	    
		st.pop();
	
		System.out.println();
		
		st.display();
		
		System.out.println();
		
		st.peek();

		
		
	}

}
