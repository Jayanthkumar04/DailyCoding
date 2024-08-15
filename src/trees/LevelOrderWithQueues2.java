package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderWithQueues2 {
	
	static class Pair
	{
		TreeNode node;
	     int level;
		Pair(TreeNode node, int level)
		{
			this.node = node;
			this.level = level;
		}
	}
	public static void levelOrderTraversing2(TreeNode root)
	{
		int prevlevel = 0;
		Queue<Pair> q = new LinkedList<>();
		
		if(root != null)
		{
			q.add(new Pair(root,0));
		}
		
		while(q.size() > 0)
		{
			Pair front = q.remove();
			
			int lvl = front.level;
			
			
			TreeNode node = front.node;
			
			if(lvl  != prevlevel)
			{
				System.out.println();
				prevlevel++;
			}
			
			System.out.print(node.val+"  ");
			if(node.left != null) q.add(new Pair(node.left,lvl+1));
			
			if(node.right != null) q.add(new Pair(node.right,lvl+1));
			
 			
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
		
		levelOrderTraversing2(a);

	}

}
