import java.util.*;

public class BreakContinue2 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number: ");
                int n = sc.nextInt();
                int m = n;
                while (m > 0) {
                        for (int i = 1; i <= n; i++) {
                                if (i == 4) {
                                        break;
                                } else {
                                        System.out.print(i);
                                }
                        }
                        m--;
                }
                sc.close();
        }
}