import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        boolean found = false;
        for(i=0; i<n; i++){
            if(arr[i] == key){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found in the array at Index: " + i);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}

