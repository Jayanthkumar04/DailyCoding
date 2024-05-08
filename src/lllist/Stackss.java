package lllist;



public class Stackss {

	public static class Stacks
	{
		int arr[] = new int[5];
		
		int index = 0;
		
		public void push(int data)
		{
			if(isFull())
				{
				System.out.println("stack is full");
				return;
				}
			
			arr[index] = data;
			index++;
			
		}
		
		public void pop()
		{
			arr[index-1]=0;
			
			index--;	
		}
		
		public void display()
		{
			for(int i=0;i<=index-1;i++)
			{
				
				System.out.print(arr[i]+"  ");
			
			}
			System.out.println();
		}
		
		public void peek()
		{
			System.out.println(arr[index-1]);
		}
		public void size()
		{
			System.out.println(index);
			
		}
		
		public boolean isFull()
		{
			if(index == arr.length) return true;
			else return false;
		}
		
		
	}
	public static void main(String[] args) {

		Stacks st = new Stacks();
		
	    st.push(10);
	    
	    st.push(20);
	    
	    st.display();//10 20
	    
	    st.pop();
	    
	    st.display();//10
	    
	    st.peek();
	    
	    st.push(90);
	    
	    st.display();//10 90
	    
	    st.size();//2
	    
	}

}
