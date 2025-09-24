import java.util.Scanner;

public class RepeatNumber {
    public static void main(String[] args) {
        Scanner kd = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = kd.nextInt();
        int[] arr = new int[size];
        boolean[] visited = new boolean[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = kd.nextInt();
        }

        System.out.println("The Repeated numbers in the array are:");
        for (int i = 0; i < size; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 0) {
                System.out.println(arr[i] + " is repeated " + count + " times");
            }
        }
    }
}