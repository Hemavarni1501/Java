import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Withdraw");
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Balance Check");
                break;
            case 4:
                System.out.println("Thank You");
                break;
            default:
                System.out.println("Invalid! Enter 1 to 4");
        }

        sc.close();
    }
}
