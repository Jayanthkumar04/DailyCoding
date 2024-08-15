package trees;

public class ProductOfTreeNodes {

	public static int multiply(Node root)
	{
		if(root == null) return 1;
		
		int mul = root.data * multiply(root.left) * multiply(root.right);
		
		return mul;
	}
	public static void main(String[] args) {

        Node a = new Node(1);
		
		Node b = new Node(2);
		
		Node c = new Node(3);
		
		Node d = new Node(4);
		
		Node e = new Node(5);
		
		Node f = new Node(6);
		
		a.left = b;
		
		a.right = c;
		
		b.left = d;
		
		c.left = e;
		
		e.left = f;
		
		int product = multiply(a);
		
		System.out.println(product);
	}

}
