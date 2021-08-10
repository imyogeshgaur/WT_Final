package JavaCircularList;

public class searchElement {
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tempo = null;

    public void addNode(int data) {
        Node new1 = new Node(data);

        if (head == null) {
            head = new1;
        } else {
            tempo.next = new1;
        }

        tempo = new1;

        tempo.next = head;
    }

    public void find(int key) {
        Node temp = head;

        int f = 0;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            do {
                if (temp.data == key) {
                    System.out.println("element is present");
                    f = 1;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
            if (f == 0) {
                System.out.println("element is not present");
            }
        }
    }

    public static void main(String[] args) {
        searchElement s = new searchElement();

        s.addNode(5);
        s.addNode(4);
        s.addNode(3);
        s.addNode(2);

        s.find(2);

        s.find(6);
    }
}
