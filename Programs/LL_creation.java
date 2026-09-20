class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL_creation{
    Node head=null;
    void insert(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            }
    }
    void printList(){
        Node temp=head;
        while(temp.next!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.print(temp.data+"-->");
            System.out.print("NULL");
    }
    public static void main(String[] args) {
        LL_creation list=new LL_creation();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.printList();
    }
}
