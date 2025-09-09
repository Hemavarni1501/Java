import java.util.Scanner;

public class CountOfElementLessThanKey {
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
        System.out.println("Enter the Key Value: ");
        int key = sc.nextInt();
        int count = 0;
        for(i=0; i<n; i++){
            if(arr[i] < key){
                count++;
            }
        }
        System.out.println("Count of elements less than key: " + count);
        sc.close();
    }
}
