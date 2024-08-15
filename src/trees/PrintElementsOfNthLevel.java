package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class PrintElementsOfNthLevel {

	static int n;
	public static void levelOrderTraversing(TreeNode root,int k)
	{
		if(root == null) return;
		
		if(n == k) System.out.print(root.val+"  ");
		
		levelOrderTraversing(root.left,k+1);
		levelOrderTraversing(root.right,k+1);
		
		
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
		
		System.out.println("enter the level u want to pring");
		
		n = sc.nextInt();
		levelOrderTraversing(a,0);

	}

}
