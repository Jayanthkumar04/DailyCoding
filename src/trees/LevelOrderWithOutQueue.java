package trees;

import java.util.Scanner;

public class LevelOrderWithOutQueue {

	static int n;
	public static int levels(TreeNode root)
	{
		if(root == null) return 0;
		
		return 1+(Math.max(levels(root.left),levels(root.right)));
	}
	
	
	public static void levelOrderTraversing(TreeNode root,int i)
	{
		if(root == null) return;
		
		if(n == i) System.out.print(root.val+"  ");
		
		levelOrderTraversing(root.left,i+1);
		levelOrderTraversing(root.right,i+1);
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		TreeNode a = new TreeNode(1);

		TreeNode b = new TreeNode(2);
		
		TreeNode c = new TreeNode(3);
		
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode f = new TreeNode(6);
		TreeNode g = new TreeNode(7);
		TreeNode h = new TreeNode(8);
		
		
		a.left = b; a.right = c;
		
		b.left=d ;b.right=e;
		
		c.left=f;c.right=g;
		
		g.left=h;
		

		int lvl = levels(a); 
		
		for(int i=0;i<lvl;i++)
		{
			n=i;
			levelOrderTraversing(a,0);
			System.out.println();
		}
		
		
	}


}
