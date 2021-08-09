package JavaSinglyList;

public class deleteNodeAtStart {
    static class Node {
        int data;
        Node next;
    };

    static Node removeFirstNode(Node head) {
        if (head == null)
            return null;

        head = head.next;

        return head;
    }

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    // Driver code
    public static void main(String args[]) {

        Node head = null;

        head = push(head, 12);
        head = push(head, 29);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 8);

        head = removeFirstNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }
}
