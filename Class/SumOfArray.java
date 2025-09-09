
import java.util.Scanner;

public class SumOfArray {
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
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements: " + sum);
    obj.close();
    }

}
