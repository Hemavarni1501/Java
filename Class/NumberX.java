import java.util.*;

public class NumberX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int t = n;  // start number from n

        for (int i = 1; i <= n; i++) {              // only n rows
            for (int j = 1; j <= n; j++) {          // only n columns
                if (i == j || i + j == n + 1) {     // X shape condition
                    System.out.print(t + " ");
                } else {
                    System.out.print("  ");         // keep spacing
                }
            }
            t--;   // decrease for next row
            System.out.println();
        }

        sc.close();
    }
}
