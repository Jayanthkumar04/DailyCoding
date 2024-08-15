package trees;

public class NodeWithMinValue {
	
	public static int mini(Node root)
	{
		if(root == null) return Integer.MAX_VALUE;
		
		int a = root.data;
		
		int b = mini(root.left);
		
		int c = mini(root.right);
		
		return Math.min(a, Math.min(b,c));	
		
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
			
			c.left = e;
			
			e.left = f;
			
			int min = mini(a);
			
			System.out.println(min);

	}

}
