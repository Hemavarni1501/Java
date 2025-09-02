import java.util.Scanner;

public class DigitOperations {

    static int countDigits(int n) {
        return Integer.toString(n).length();
    }

    static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    static int productDigits(int n) {
        int prod = 1;
        while (n != 0) {
            prod *= (n % 10);
            n /= 10;
        }
        return prod;
    }

    static int evenDigits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n % 10) % 2 == 0) count++;
            n /= 10;
        }
        return count;
    }

    static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Sum of digits: " + sumDigits(num));
        System.out.println("Product of digits: " + productDigits(num));
        System.out.println("Even digits count: " + evenDigits(num));
        System.out.println("Reverse: " + reverseNumber(num));

        sc.close();
    }
}
