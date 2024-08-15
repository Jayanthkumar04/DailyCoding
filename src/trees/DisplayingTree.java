package trees;

public class DisplayingTree {

//	static int sum=0;
//	public static void display(Node root)
//	{
//	
//		if(root == null) return ;
//		
//		sum = sum + root.data;
//		System.out.print(root.data+"  ");
//		
//		display(root.left);
//		
//		display(root.right);
//		
//		
//	}	
	
	public static void display(Node root)
	{
		if(root == null) return;
		
		System.out.println(root.data);
		display(root.left);
		display(root.right);
		
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
		
		e.left=f;
		
		
		display(a);
		
//		System.out.println(sum);
	}

}
