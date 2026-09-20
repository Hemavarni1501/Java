import java.util.Scanner;
class stack {
    int max=5; int top=-1; int[] stack=new int[max];
    void push(int value){
        if(top==max-1){
            System.out.println("Stack Overflow");}
        else{
            stack[++top]=value;
            System.out.println("Data Pushed:"+stack[top]);
        }
        }void pop(){
            if(top==-1){
                System.out.println("Stack Underflow");
            }
            else
            System.out.println("Data Popped:"+stack[top--]);
        }
        void peek(){
            if(top==-1){
                System.out.println("Stack is Empty");
            }
            else
            System.out.println("Data Peek:"+stack[top]);
        }
        void display(){
            if(top==-1){
                System.out.println("Stack is Empty");}
            else{
                System.out.println("Stack Elements");
                for(int i=top;i>=0;i--){
                    System.out.println(stack[i]);
                }
            }
            }
        }

public class stack_array{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int ch,val;
        stack st=new stack();
        while(true){
        System.out.println("\n---STACK MENU---\n1.PUSH\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT\n");
        System.out.println("Enter your choice:");
        ch=s.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter value to Push:");
                val=s.nextInt();
                st.push(val);
                break;
            case 2:
                st.pop();
                break;
            case 3:
                st.peek();
                break;
            case 4:
                st.display();
                break;
            case 5:
                System.out.println("Exiting.....");
                return;
            default:
                System.out.println("Invalid Choice!");
        }
    }
    }
}
    
/*
--STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
1
Enter value to Push:
5
Data Pushed:5

---STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
1
Enter value to Push:
10
Data Pushed:10

---STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
1
Enter value to Push:
15
Data Pushed:15

---STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
3
Data Peek:15

---STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
4
Stack Elements
15
10
5

---STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
2
Data Popped:15

---STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
4
Stack Elements
10
5

---STACK MENU---
1.PUSH
2.POP
3.PEEK
4.DISPLAY
5.EXIT

Enter your choice:
5
Exiting.....
*/
