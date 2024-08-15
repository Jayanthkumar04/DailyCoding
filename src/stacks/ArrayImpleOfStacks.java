package stacks;

public class ArrayImpleOfStacks {

	public static class StackUser
	{
		int arr[] = new int[5];
		
		int index = 0;
		
		void push(int x)
		{
		  if(index == arr.length) 
		  {
			  System.out.println("stack overflow");
			
		  }
		  else
		  {
			arr[index] = x;
			
			index++;
		  }
		  }
		
		void display()
		{
			for(int i=0;i<=index-1;i++)
			{
				System.out.print(arr[i]+"  ");
			}
		}
		
		 int pop()
		{
			System.out.println("element removed : "+arr[index-1]);
			int top = arr[index-1];
			arr[index-1]=0;
			
			index = index -1;
			
			return top;
		}
		 
		void peek()
		{
			System.out.println("peek is "+arr[index-1]);
		}
		
		int size()
		{
			return index;
		}
		
		
		
	}
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
	
		st.display();
		
		st.peek();
		
		System.out.println(st.size());
	}

}
