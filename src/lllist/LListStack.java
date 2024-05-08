package lllist;


public class LListStack {

	public static class Node
	{
		int data;
		Node next;
	
		Node(int data)
		{
			this.data = data;
		}
	}
	
	public static class Stacks
	{
		Node head = null;
		
		int size = 0;
		
		public void push(int data)
		{
			
			Node temp = new Node(data);
			
			temp.next =head;
			head = temp;
			
			size++;
			
		}
		
		public void display()
		{
			Node temp = head;
			
			while(temp != null)
			{
				System.out.print(temp.data);
			    temp=temp.next;
			}
			System.out.println();
			
		}
		
		
		public void size()
		{
			
			System.out.println(size);
		}
		
		public void pop()
		{
			if(head == null)
				return;
			
			head = head.next;
		}
		
		public void peek()
		{
			System.out.println(head.data);
		}
		
	}
	public static void main(String[] args) {

        Stacks st = new Stacks();
		
	    st.push(10);
	    
	    st.push(20);
	    
	    st.display();//10 20
	    
	    st.pop();
	    
	    st.display();//10
	    
	    st.peek();//10
	    
	    st.push(90);
	    
	    st.display();//10 90
	    
	    st.size();//2
	    
	    st.peek();//90

	}

}
