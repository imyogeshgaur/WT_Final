package JavaTree;

class Nodes
{
	int data;
	Nodes left, right;

	Nodes(int item)
	{
		data = item;
		left = right = null;
	}
}

class Leaf
{
	int leaflevel=0;
}


public class allAtSameLevel {
    
	Nodes root;
	Leaf mylevel = new Leaf();
	
	/* Recursive function which checks whether all leaves are at same
	level */
	boolean checkUtil(Nodes node, int level, Leaf leafLevel)
	{
		// Base case
		if (node == null)
			return true;
			
		// If a leaf node is encountered
		if (node.left == null && node.right == null)
		{
			// When a leaf node is found first time
			if (leafLevel.leaflevel == 0)
			{
				// Set first found leaf's level
				leafLevel.leaflevel = level;
				return true;
			}

			// If this is not first leaf node, compare its level with
			// first leaf's level
			return (level == leafLevel.leaflevel);
		}

		return checkUtil(node.left, level + 1, leafLevel)
				&& checkUtil(node.right, level + 1, leafLevel);
	}

	
	boolean check(Nodes node)
	{
		int level = 0;
		return checkUtil(node, level, mylevel);
	}

	public static void main(String args[])
	{
		allAtSameLevel tree = new allAtSameLevel();
		tree.root = new Nodes(12);
		tree.root.left = new Nodes(5);
		tree.root.left.left = new Nodes(3);
		tree.root.left.right = new Nodes(9);
		tree.root.left.left.left = new Nodes(1);
		tree.root.left.right.left = new Nodes(1);
		if (tree.check(tree.root))
			System.out.println("Leaves are at same level");
		else
			System.out.println("Leaves are not at same level");
	}
}




