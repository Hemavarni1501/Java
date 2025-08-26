import java.util.Scanner;
import static java.lang.Math.*;

public class MileageRemunerationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter beginning odometer reading: ");
        double beg = scanner.nextDouble();
        System.out.print("Enter ending odometer reading: ");
        double end = scanner.nextDouble();
        double dist = end - beg;
        if (dist < 0) {
            System.out.println("Error: Ending odometer reading must be greater than or equal to beginning reading.");
        } 
        double rate=25;
        System.out.printf("Distance traveled: %.2f%n miles",dist);
        System.out.println("Mileage reimbursement rate: Rs." + rate + " per mile");
        double total_cost = dist * rate;
        System.out.printf("Total reimbursement: Rs.%.2f%n" ,ceil(total_cost));
        scanner.close();
    }
}