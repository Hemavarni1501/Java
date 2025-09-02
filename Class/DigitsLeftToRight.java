import java.util.Scanner;

public class DigitsLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        sc.close();
    }
}
