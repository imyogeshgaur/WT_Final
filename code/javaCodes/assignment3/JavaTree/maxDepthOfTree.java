package JavaTree;

class happyNode {
    int data;
    happyNode left, right;

    happyNode(int item) {
        data = item;
        left = right = null;
    }
}

public class maxDepthOfTree {
    happyNode root;

    int maxDepth(happyNode node) {
        if (node == null)
            return 0;
        else {
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public static void main(String[] args) {
        maxDepthOfTree tree = new maxDepthOfTree();

        tree.root = new happyNode(1);
        tree.root.left = new happyNode(2);
        tree.root.right = new happyNode(3);
        tree.root.left.left = new happyNode(4);
        tree.root.left.right = new happyNode(5);

        System.out.println("Height of tree is : " + tree.maxDepth(tree.root));
    }
}
