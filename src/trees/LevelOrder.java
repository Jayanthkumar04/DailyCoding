package trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int val)
	{
		this.val = val;
	}
}
public class LevelOrder {

	public static void levelOrderTraversing(TreeNode root)
	{
		
		Queue<TreeNode> q = new LinkedList<>();
		
		if(root !=null) q.add(root);
		
		while(q.size() > 0)
		{
			TreeNode front = q.remove();
		   
			System.out.print(front.val+"   ");
			
			if(front.left != null) q.add(front.left);
			if(front.right != null) q.add(front.right);
			
		}
		
	}
	public static void main(String[] args) {

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
		
		levelOrderTraversing(a);
		
		
	}

}
