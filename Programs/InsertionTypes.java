class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class InsertionTypes{
    Node head=null;
    void insertBeg(int value){
        Node newNode = new Node(value);
        newNode.next=head;
        head=newNode;
    }
    void insertEnd(int value){
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
    void insertPos(int value,int pos){
        Node newNode=new Node(value);
        Node temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
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
        InsertionTypes list=new InsertionTypes();
        list.insertBeg(10);
        list.insertEnd(20);
        list.insertPos(30,3);
        list.printList();
    }
}
