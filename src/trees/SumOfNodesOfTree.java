package trees;

public class SumOfNodesOfTree {
	
	public static int nodesSum(Node root)
	{	if(root == null) return 0;
		int sum = root.data+nodesSum(root.left)+nodesSum(root.right);
		return sum;
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

		int sum = nodesSum(a);
		
		System.out.println(sum);
		
		
	}

}
