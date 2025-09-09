
import java.util.Scanner;

public class MinMaxOfArray {
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
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Minimum element: " +min);
        System.out.println("Maximum element: " +max);
    obj.close();
    }

}
