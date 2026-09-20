class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionTypes {
    Node head = null;

    // Insert at the end of the list
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

    // Delete the first node
    void deleteBeg() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    // Delete the last node
    void deleteEnd() {
        if (head == null) return;
        
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete node at a specific position (1-based index)
    void deletePos(int pos) {
        if (head == null) return;

        // If head needs to be removed
        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        // Traverse to the node just before the one we want to delete
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }

        // If position is out of range or node to delete is null
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        // Unlink the node from the list
        temp.next = temp.next.next;
    }

    // Display the list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DeletionTypes list = new DeletionTypes();
        
        System.out.println("Initial List:");
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.printList(); // 10 --> 20 --> 30 --> 40 --> NULL

        System.out.println("\nAfter deleting from beginning:");
        list.deleteBeg();
        list.printList(); // 20 --> 30 --> 40 --> NULL

        System.out.println("\nAfter deleting at position 2 (value 30):");
        list.deletePos(2);
        list.printList(); // 20 --> 40 --> NULL

        System.out.println("\nAfter deleting from end:");
        list.deleteEnd();
        list.printList(); // 20 --> NULL
    }
}