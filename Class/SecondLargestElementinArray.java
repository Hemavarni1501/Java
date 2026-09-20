import java.util.Scanner;   
import java.util.Arrays;
public class SecondLargestElementinArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int size=obj.nextInt();
            int[] array=new int[size];
            int i;
            System.out.println("Enter the elements of the array: ");
            for(i=0;i<size;i++){
                array[i]=obj.nextInt();
            }
        Arrays.sort(array);
        System.out.println("Second largest element: " +array[size-2]);
        obj.close();
    }

}