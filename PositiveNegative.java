import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number>0) {
            System.out.println(number + " is Positive.");
        } 
        else if(number<0) {
            System.out.println(number + " is Negative.");
        }
        else {
            System.out.println(number + " is Zero.");
        }
        scanner.close();
    }
}