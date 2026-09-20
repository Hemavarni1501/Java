import java.util.*;

public class HouseStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int width = 2 * n - 1;

        // Print the triangle (roof)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the rectangle (base)
        int stars = n / 2 + n % 2; // left group
        int spaces = width - 2 * stars;
        int baseLines = n - 2; // number of lines for base
        for (int i = 1; i <= baseLines; i++) {
            // Left stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}