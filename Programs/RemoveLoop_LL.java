class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class RemoveLoop_LL {
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

    void detectandRemoveLoop() {
        Node slow=head;
        Node fast=head;
        boolean loop=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                loop=true;
                break;
            }
        }       
        if(loop){
            System.out.println("Loop Found");
            slow=head;
            while(slow.next!=fast.next){
                slow=slow.next; fast=fast.next;
            }
            fast.next=null;
            System.out.println("Loop Removed");
        }
        else{
            System.out.println("No Loop found");
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
        RemoveLoop_LL list = new RemoveLoop_LL();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.printList();
        //creating loop
        list.head.next.next.next.next=list.head.next;

        list.detectandRemoveLoop();
        list.printList();
    }
}
