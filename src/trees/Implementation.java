package trees;

 class Node
{
	int data;
	
	Node left;
	
	Node right;
	
	Node(int data)
	{
		this.data = data;
	}
}
public class Implementation {

	
	public static void main(String[] args) {

		
		Node a = new Node(1);
		
		
		Node b = new Node(4);

		Node c = new Node(3);
		
		Node d = new Node(2);
		
		Node e = new Node(6);
		
		Node f = new Node(5);
		
		a.left = b;
		
		a.right =  c;
		
		b.left = d;
		
		b.right=e;
		
		
		c.right=f;
		
		
		System.out.println(a.data);
		
		System.out.println(a.left.data);
		
	}

}
