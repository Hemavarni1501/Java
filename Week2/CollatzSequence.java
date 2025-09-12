import java.util.*;
public class CollatzSequence {
    public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int temp=scanner.nextInt();
    System.out.println("Collatz Sequence:");
    System.out.print(temp+" ");
    for (int i = 0; i < 10; i++) {
        if(temp==1){
            break;
        }  
        else{ 
        if(temp%2==0){
            temp=temp/2;
            System.out.print(temp+" ");
        }
        else{
            temp=(3*temp)+1;
            System.out.print(temp+" ");
        }
    }
    }
    scanner.close();
}
}
