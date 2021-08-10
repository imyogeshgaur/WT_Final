package JavaCircularList;

public class deleteFromMid {
    class Node {
        int data;
        Node next;
    }

    private static int size;

    private Node head, tail;

    deleteFromMid() {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public void addNode(int d) {
        Node n = new Node();

        if (this.head == null) {
            n.data = d;
            this.head = n;
            this.tail = n;
            n.next = this.head;
        }

        else {
            n.data = d;
            tail.next = n;
            tail = n;
            tail.next = head;
        }
        size++;
    }

    public void deleteNodeMiddle() {
        int loc;
        Node temp, prev;

        if (size % 2 == 0) {
            loc = size / 2;
        } else {
            loc = (size / 2) + 1;
        }

        if (head == null) {
            return;
        }

        else if (head == tail) {
            head = null;
            tail = null;
        }

        else if (loc == 1) {
            head = tail;
            tail.next = tail;
        }

        else {
            temp = head;
            prev = null;
            int i = 1;
            while (i < loc) {
                prev = temp;
                temp = temp.next;
                i++;
            }
            prev.next = temp.next;
            temp = null;
        }

        size--;
        if (size < 0) {
            size = 0;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
}

class Test {
    public static void main(String args[]) {
        deleteFromMid c1 = new deleteFromMid();

        c1.addNode(10);
        c1.addNode(20);
        c1.addNode(30);
        c1.addNode(40);

        System.out.print("List=");
        c1.display();

        c1.deleteNodeMiddle();

        System.out.print("List after deleting middle node=");
        c1.display();

        c1.deleteNodeMiddle();

        System.out.print("List after deleting middle node=");
        c1.display();

        c1.deleteNodeMiddle();

        System.out.print("List after deleting middle node=");
        c1.display();

        c1.deleteNodeMiddle();

        System.out.print("List after deleting middle node=");
        c1.display();
    }
}
