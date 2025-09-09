import java.util.Scanner;
public class InsertArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=obj.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter the element to be inserted: ");
        int ele=obj.nextInt();
        System.out.println("Enter the position to insert the element: ");
        int pos=obj.nextInt();
        for(int i=size;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=ele;
        System.out.println("Array after insertion: ");
        for(int i=0;i<=size;i++){   
            System.out.print(arr[i]+" ");
        }
        obj.close();
    }
}
