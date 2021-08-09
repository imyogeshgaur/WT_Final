package JavaSinglyList;

public class deleteFromEnd {
    static class Node {
        int data;
        Node next;
    };

    static Node removeLastNode(Node head) {
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }

        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        second_last.next = null;

        return head;
    }

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    public static void main(String args[]) {
        Node head = null;

        head = push(head, 12);
        head = push(head, 29);
        head = push(head, 11);
        head = push(head, 23);
        head = push(head, 8);

        head = removeLastNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }
}
