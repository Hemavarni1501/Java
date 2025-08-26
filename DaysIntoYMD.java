import java.util.Scanner;

public class DaysIntoYMD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Days: ");
        int days = scanner.nextInt();
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;
        System.out.println(" Days:"+days+"\n Year(s):" + years + " \n Month(s):" + months + " \n Day(s):"+ remainingDays );
        scanner.close();
    }
}