import java.util.Scanner;

public class NumberPatternN {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Row Value:");
        int n = ob.nextInt();
        int start = 1;

        for (int i = 1; i <= n; i++) {
            int current = start;
            System.out.print(current + " ");
            for (int j = 1; j < i; j++) { 
                current = current - (n - i + j);
                System.out.print(current + " ");
            }
            System.out.println();
            start = start + (n - (i - 1));
        }

        ob.close(); 
    }
}
