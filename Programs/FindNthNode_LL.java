class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    } 
}

public class FindNthNode_LL {
    Node head;

    void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void FindNthNode(int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            if (first == null) {
                System.out.println("List is smaller than n");
                return;
            }
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.println("Nth Node from the End: " + second.data);
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        FindNthNode_LL list = new FindNthNode_LL();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);

        list.printList();
        list.FindNthNode(2);
    }
}