import java.util.*;

public class LarrysArray {

    static void rotate(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = arr[i + 2];
        arr[i + 2] = temp;
    }

    public static String larrysArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            while (arr[i] != i + 1) {

                int pos = -1;
                for (int j = i; j < n; j++) {
                    if (arr[j] == i + 1) {
                        pos = j;
                        break;
                    }
                }

                if (pos - i >= 2) {
                    rotate(arr, pos - 2);
                } else if (pos - i == 1) {
                    rotate(arr, pos - 1);
                } else {
                    break;
                }
            }
        }

        if (arr[n - 2] < arr[n - 1])
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(larrysArray(arr));

        sc.close();
    }
}
