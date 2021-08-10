package JavaCircularList;

public class nNodesCount {
    static class Node {
        int data;
        Node next;
    };

    static Node push(Node head_ref, int data) {
        Node ptr1 = new Node();
        Node temp = head_ref;
        ptr1.data = data;
        ptr1.next = head_ref;

        if (head_ref != null) {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        } else
            ptr1.next = ptr1;

        head_ref = ptr1;
        return head_ref;
    }

    static int countNodes(Node head) {
        Node temp = head;
        int result = 0;
        if (head != null) {
            do {
                temp = temp.next;
                result++;
            } while (temp != head);
        }

        return result;
    }

    public static void main(String args[]) {

        Node head = null;
        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);

        System.out.printf("%d", countNodes(head));
    }
}
