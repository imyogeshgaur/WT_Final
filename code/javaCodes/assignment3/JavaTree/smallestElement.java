package JavaTree;

class myNewNode {

    int data;
    myNewNode left, right;

    myNewNode(int d) {
        data = d;
        left = right = null;
    }
}


public class smallestElement {
    static myNewNode head;

    myNewNode insert(myNewNode node, int data) {

        if (node == null) {
            return (new myNewNode(data));
        } else {

            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }

            return node;
        }
    }

    int minvalue(myNewNode node) {
        myNewNode current = node;

        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    public static void main(String[] args) {
        smallestElement tree = new smallestElement();
        myNewNode root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);

        System.out.println("Minimum value of BST is " + tree.minvalue(root));
    }
}


