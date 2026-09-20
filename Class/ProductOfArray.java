
import java.util.Scanner;

public class ProductOfArray {
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
        int prod = 1;
        for (i = 0; i < array.length; i++) {
            prod *= array[i];
        }
        System.out.println("Product of array elements: " +prod);
    obj.close();
    }

}
