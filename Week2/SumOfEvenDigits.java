import java.util.Scanner;

public class SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            int dig= num % 10;
            if (dig % 2 == 0) {
                sum += dig;
            }
            num /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
