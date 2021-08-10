package JavaCircularList;

class Node {
    int data;
    Node next;
    Node prev;
};

class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void push_front(int newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = null;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            Node temp = new Node();
            temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void PrintList() {
        Node temp = new Node();
        temp = this.head;
        if (temp != null) {
            System.out.print("The list contains: ");
            while (true) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
                if (temp == this.head)
                    break;
            }
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }
};

public class insertAtBeginning {
    public static void main(String[] args) {
        LinkedList MyList = new LinkedList();

        MyList.push_front(10);
        MyList.push_front(20);
        MyList.push_front(30);
        MyList.PrintList();
    }
}
