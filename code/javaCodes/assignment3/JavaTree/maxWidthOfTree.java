package JavaTree;

class myNode {
    int data;
    myNode left, right;

    myNode(int item) {
        data = item;
        left = right = null;
    }
}

public class maxWidthOfTree {
    myNode root;

    int getMaxWidth(myNode node) {
        int maxWidth = 0;
        int width;
        int h = height(node);
        int i;

        for (i = 1; i <= h; i++) {
            width = getWidth(node, i);
            if (width > maxWidth)
                maxWidth = width;
        }

        return maxWidth;
    }

    int getWidth(myNode node, int level) {
        if (node == null)
            return 0;

        if (level == 1)
            return 1;
        else if (level > 1)
            return getWidth(node.left, level - 1) + getWidth(node.right, level - 1);
        return 0;
    }

    int height(myNode node) {
        if (node == null)
            return 0;
        else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);

            return (lHeight > rHeight) ? (lHeight + 1) : (rHeight + 1);
        }
    }

    public static void main(String args[]) {
        maxWidthOfTree tree = new maxWidthOfTree();

        tree.root = new myNode(1);
        tree.root.left = new myNode(2);
        tree.root.right = new myNode(3);
        tree.root.left.left = new myNode(4);
        tree.root.left.right = new myNode(5);
        tree.root.right.right = new myNode(8);
        tree.root.right.right.left = new myNode(6);
        tree.root.right.right.right = new myNode(7);

        System.out.println("Maximum width is " + tree.getMaxWidth(tree.root));
    }
}
