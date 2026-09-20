import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter the Elements of the Array: ");    
        for (i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Displaying Array elements using FOR loop: ");
        for (i = 0; i < n; i++) {
           System.out.print(arr[i]+" ");
        }
         System.out.println();
         System.out.println("Displaying Array elements using FOR-EACH loop: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("Displaying Array elements using Arrays Class: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Displaying Array elements in Reverse Order: ");
        for (i = n-1; i >=0; i--) {
           System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}