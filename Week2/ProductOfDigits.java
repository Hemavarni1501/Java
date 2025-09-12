import java.util.Scanner;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int prod = 1;
        while (n != 0) {
            prod *= (n % 10);
            n /= 10;
        }
        System.out.println("Product of digits: " + prod);
        sc.close();
    }
}
