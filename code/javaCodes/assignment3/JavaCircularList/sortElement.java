package JavaCircularList;

public class sortElement {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head_of_node = null;

    public Node last = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head_of_node == null) {
            head_of_node = newNode;
            last = newNode;
            newNode.next = head_of_node;
        } else {
            last.next = newNode;
            last = newNode;
            last.next = head_of_node;
        }
    }

    public void Sort_List() {

        Node current = head_of_node;

        Node temp = null;

        int value;

        if (head_of_node == null) {
            System.out.println("Your list is empty");
        } else {
            while (current.next != head_of_node) {
                temp = current.next;
                while (temp != head_of_node) {
                    if (current.data > temp.data) {
                        value = current.data;
                        current.data = temp.data;
                        temp.data = value;
                    }
                    temp = temp.next;
                }
                current = current.next;
            }
        }
    }

    public void Print_List() {
        Node current = head_of_node;
        if (head_of_node == null) {
            System.out.println("Your list is empty");
        } else {
            do {
                System.out.print(" -> " + current.data);
                current = current.next;
            } while (current != head_of_node);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        sortElement circular_list = new sortElement();
        circular_list.add(10);
        circular_list.add(6);
        circular_list.add(3);
        circular_list.add(8);
        circular_list.add(4);

        System.out.print("Original List -->	 ");
        circular_list.Print_List();
        circular_list.Sort_List();
        System.out.print("List after Sorting--> ");
        circular_list.Print_List();
    }
}
