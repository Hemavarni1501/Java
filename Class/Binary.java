import java.util.*;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int a = 1; a <= n; a++) {
            for (int i = 0; i <= a; i += a) {
                for (int j = 0; j <= a; j += a) {
                    for (int k = 0; k <= a; k += a) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
            System.out.println();
        }
    }
}