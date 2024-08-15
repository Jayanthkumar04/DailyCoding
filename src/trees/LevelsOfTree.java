package trees;

public class LevelsOfTree {

	public static int level(Node root)
	{
		if(root == null) return 0;
		
		int left = level(root.left);
		
		int right = level(root.right);
		
//		return 1+Math.max(level(root.left),level(root.right));	
		
		return 1+Math.max(left, right);
	}
	public static void main(String[] args) {
		Node a = new Node(1);
		
		Node b = new Node(2);
		
		Node c = new Node(5);
		
		Node d = new Node(4);
		
		Node e = new Node(100);
		
		Node f = new Node(9);
		
		a.left = b;
		
		a.right = c;
		
		b.left = d;
		
		b.right = e;
		
		c.left = f;

		System.out.println("level of tree = "+level(a));
		
	}

}
