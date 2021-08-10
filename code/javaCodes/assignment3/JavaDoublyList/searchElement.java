package JavaDoublyList;

public class searchElement {
    static class Node {

        int data;

        Node next;

        Node prev;
    };

    static Node push(Node head_ref, int new_data) {

        Node new_node = new Node();

        new_node.data = new_data;

        new_node.prev = null;

        new_node.next = head_ref;

        if (head_ref != null) {

            head_ref.prev = new_node;
        }

        head_ref = new_node;
        return head_ref;
    }

    static int search(Node head_ref, int x) {

        Node temp = head_ref;

        int pos = 0;

        while (temp.data != x && temp.next != null) {
            pos++;

            temp = temp.next;
        }

        if (temp.data != x)
            return -1;

        return (pos + 1);
    }

    public static void main(String[] args) {
        Node head = null;
        int X = 8;

        head = push(head, 14);
        head = push(head, 9);
        head = push(head, 8);
        head = push(head, 15);
        head = push(head, 18);
        System.out.print(search(head, X));
    }
}
