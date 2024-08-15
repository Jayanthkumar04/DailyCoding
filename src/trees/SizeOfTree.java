package trees;

public class SizeOfTree {

//	static int size2 = 0;
	public static  int size(Node root)
	{
		
		if(root == null) return 0;

//		size2=size2+1;
//		size(root.left);
//		size(root.right);

		
		return 1+size(root.left)+size(root.right);
		
		
		
		
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
			
            System.out.println("size is: "+size(a));
	
	  //edges = size - 1;
	}

}
