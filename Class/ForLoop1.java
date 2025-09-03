import java.util.*;

public class ForLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<= n; j++) {
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }
    }
}