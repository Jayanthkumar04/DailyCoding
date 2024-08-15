package trees;

public class InvertTree {

	public static void display(Node root)
	{
		if(root == null) return;
		
		System.out.print(root.data+"  ");
		
		display(root.left);
		
		display(root.right);
		
	}
	
	public static void displayReverse(Node root)
	{
		
		if(root == null) return;
		
		if(root.left == null && root.right == null) return;
		
		Node temp = root.left;
		
		root.left = root.right;
		
		root.right = temp;
		
		displayReverse(root.left);

		displayReverse(root.right);
		
	}
	public static void main(String[] args) {

		
		Node a = new Node(10);
	
		Node b = new Node(20);
		
		Node c = new Node(30);
		
		Node d = new Node(40);
		
		Node e = new Node(50);
		
		Node f = new Node(60);
		
		Node g = new Node(70);
		
		a.left = b; a.right = c;
		
		b.left=d;  b.right = e;
		
		c.left=f;  c.right=g;
		
		System.out.println("before revese");
		display(a);
		
		displayReverse(a);
		
		System.out.println("\nafter reverse");
		
		display(a);
		
		
		
		
	}

}
