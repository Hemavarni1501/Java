import java.util.Scanner;

public class SBICreditCardEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primaryAge = sc.nextInt();
        int addonAge = sc.nextInt();
        int employmentType = sc.nextInt();
        int income = sc.nextInt();

        boolean eligible = true;

        if (primaryAge < 21 || primaryAge > 60) {
            eligible = false;
        } else if (addonAge <= 18) {
            eligible = false;
        } else if (employmentType < 1 || employmentType > 4) {
            eligible = false;
        } else if (income > 300000) {
            eligible = false;
        }

        if (eligible) {
            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }
        sc.close();
    }
}
