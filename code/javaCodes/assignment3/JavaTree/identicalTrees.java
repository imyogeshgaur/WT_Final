package JavaTree;

class NodeAtTop
{
	int data;
	NodeAtTop left, right;

	NodeAtTop(int item)
	{
		data = item;
		left = right = null;
	}
}


public class identicalTrees {
    NodeAtTop root1, root2;


	boolean identicalTree(NodeAtTop a, NodeAtTop b)
	{
		if (a == null && b == null)
			return true;
			
		if (a != null && b != null)
			return (a.data == b.data
					&& identicalTree(a.left, b.left)
					&& identicalTree(a.right, b.right));

		return false;
	}

	
	public static void main(String[] args)
	{
		identicalTrees tree = new identicalTrees();

		tree.root1 = new NodeAtTop(1);
		tree.root1.left = new NodeAtTop(2);
		tree.root1.right = new NodeAtTop(3);
		tree.root1.left.left = new NodeAtTop(4);
		tree.root1.left.right = new NodeAtTop(5);

		tree.root2 = new NodeAtTop(1);
		tree.root2.left = new NodeAtTop(2);
		tree.root2.right = new NodeAtTop(3);
		tree.root2.left.left = new NodeAtTop(4);
		tree.root2.left.right = new NodeAtTop(5);

		if (tree.identicalTree(tree.root1, tree.root2))
			System.out.println("Both trees are identical");
		else
			System.out.println("Trees are not identical");

	}
}

