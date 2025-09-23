import java.util.*;
import java.util.Arrays;
class RepeatNumber{
public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size=obj.nextInt();
            int[] a=new int[size];
            int i,j;
            System.out.println("Enter the elements of the array: ");
            for(i=0;i<size;i++){
                a[i]=obj.nextInt();
            }
        for(i=0;i<size;i++){
            int c=0;
            for(j=0;j<size;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            System.out.println(a[i]+" --> "+c);
        }
        obj.close();
    }
}