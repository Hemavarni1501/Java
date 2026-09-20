
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Search_LL {
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

    void search(int key) {
        Node temp=head;
        int pos=1;
        while (temp != null) {
            if(temp.data==key){
                System.out.println("Element Found at Position:"+pos);
                return;
            }
            temp=temp.next;
            pos++;
            System.out.println("element not Found");
        }
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
        Search_LL list = new Search_LL();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.printList();
        list.search(30);
    }
}
