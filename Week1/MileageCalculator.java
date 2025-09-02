import java.util.Scanner;

public class Q5_MileageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double start = sc.nextDouble();
        double end = sc.nextDouble();

        double miles = end - start;
        double remuneration = miles * 25;

        System.out.printf("%.2f %.2f\n", miles, remuneration);
        sc.close();
    }
}
