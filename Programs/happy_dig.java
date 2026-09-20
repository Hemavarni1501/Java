import java.util.Scanner;
public class happy_dig {
    public static boolean isHappy(int n) {
        int[] seen = new int[1000];
        int index = 0;
        while (n != 1) {
            for (int i = 0; i < index; i++) {
                if (seen[i] == n) {
                    return false;
                }
            }
            seen[index] = n;
            index++;
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit);
                temp = temp / 10;
            }
            n = sum;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isHappy(num));
        scanner.close();
    }
}