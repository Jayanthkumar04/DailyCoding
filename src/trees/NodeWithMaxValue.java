package trees;

public class NodeWithMaxValue {

	public static int maxi(Node root)
	{
		if(root == null) return Integer.MIN_VALUE;
		
//		int a = root.data;
//		
//		int b = maxi(root.left);
//		
//		int c = maxi(root.right);
//		
//		return Math.max(a, Math.max(b,c));
//		
		return Math.max(root.data,Math.max(maxi(root.left),maxi(root.right)));
		
		
	}
	public static void main(String[] args) {

        Node a = new Node(1);
		
		Node b = new Node(2);
		
		Node c = new Node(0);
		
		Node d = new Node(4);
		
		Node e = new Node(100);
		
		Node f = new Node(0);
		
		a.left = b;
		
		a.right = c;
		
		b.left = d;
		
		c.left = e;
		
		e.left = f;
		
		int max = maxi(a);
		
		System.out.println(max);


	}

}
