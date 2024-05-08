package lllist;

public class QueueArray {

	public static class Queue
	{
		
		int f=-1 , r=-1;
		
		int size = 0;
		
		int arr[] = new int[10];
		
		public void push(int data)
		{
			if(r == arr.length-1)
			{
			
				System.out.println("queue is full");
			    return;
			
			}
			
			if(f == -1)
			{
				f=r=0;
				arr[0] = data;
				
				size++;
			}
			else
			{
				
				arr[++r] = data;
				size++;
			
			}
			
		}
		
		public void display()
		{
		for(int i=f ;i<=r;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		
		System.out.println();
		}
		
		public void pop()
		{
			f++;
			size--;
			
		}
		
		public void peek()
		{
			System.out.println(arr[f]);
		}
		
		public boolean isFull()
		{
			if(size == arr.length) return true;
			
			else
				return false;
		}
		
	}
	
	public static void main(String[] args) {

	
		Queue q = new Queue();
		
		q.push(20);
		
		q.push(66);
		
		q.push(63);
		
		q.display();
		
		q.pop();
		
		q.display();
		
		q.peek();
		
		
		
		
	
	}

}
