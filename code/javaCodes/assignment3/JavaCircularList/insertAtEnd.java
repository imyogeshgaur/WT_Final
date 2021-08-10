package JavaCircularList;

class NodeEnd {
    int data;
    NodeEnd next;
    NodeEnd prev;
};

class LinkedListEnd {
    NodeEnd head;

    LinkedListEnd() {
        head = null;
    }

    void push_back(int newElement) {
        NodeEnd newNode = new NodeEnd();
        newNode.data = newElement;
        newNode.next = null;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            newNode.next = head;
            newNode.prev = head;
        } else {
            NodeEnd temp = new NodeEnd();
            temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
            newNode.prev = temp;
            head.prev = newNode;
        }
    }

    void PrintList() {
        NodeEnd temp = new NodeEnd();
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

public class insertAtEnd {
    public static void main(String[] args) {
        LinkedListEnd MyList = new LinkedListEnd();

        MyList.push_back(10);
        MyList.push_back(20);
        MyList.push_back(30);
        MyList.PrintList();
    }
}