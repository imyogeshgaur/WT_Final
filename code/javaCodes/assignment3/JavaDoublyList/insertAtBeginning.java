package JavaDoublyList;

public class insertAtBeginning {

    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void AppendStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            head.previous = newNode;
            newNode.next = head;
            newNode.previous = null;
            head = newNode;
        }
    }

    public void print() {
        Node curr = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Append a node to the start of the list: ");
        while (curr != null) {

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        insertAtBeginning dList = new insertAtBeginning();

        dList.AppendStart(5);
        dList.print();
        dList.AppendStart(4);
        dList.print();
        dList.AppendStart(3);
        dList.print();
        dList.AppendStart(2);
        dList.print();
        dList.AppendStart(1);
        dList.print();
    }
}
