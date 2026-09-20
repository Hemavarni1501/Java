import java.util.Scanner;

public class NameTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to form a Triangle Pattern:");
        String name = sc.next();
        for (int i = 1; i <= name.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
        sc.close();
    }
}