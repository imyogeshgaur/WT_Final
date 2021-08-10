package JavaCircularList;

public class deleteFromEnd {
    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    public void delete() {
        if (head == null) {
            return;
        }

        else {

            if (head != tail) {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = head;
            }

            else {
                head = tail = null;
            }
        }
    }

    public void printNode() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                System.out.print(" -> " + current.val);
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        deleteFromEnd list = new deleteFromEnd();

        list.addNode(5);
        list.addNode(3);
        list.addNode(4);

        System.out.println("Original List: ");
        list.printNode();

        while (list.head != null) {

            list.delete();

            System.out.println("Updated List: ");
            list.printNode();
        }
    }
}
