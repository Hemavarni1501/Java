class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Count_LL {
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

    void count() {
        Node temp=head;
        int pos=0;
        while (temp != null) {
            temp=temp.next;
            pos++;
        }
         System.out.println("Count="+pos);
    }

    void printList() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Count_LL list = new Count_LL();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.printList();
        list.count();
    }
}
