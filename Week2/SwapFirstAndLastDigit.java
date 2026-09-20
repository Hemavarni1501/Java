
import java.util.Scanner;

public class SwapFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String numStr = Integer.toString(num);  
        String swappedNumStr = numStr.charAt(numStr.length() - 1) + numStr.substring(1, numStr.length() - 1) + numStr.charAt(0);
        int swappedNum = Integer.parseInt(swappedNumStr);
        System.out.println("Number after swapping first and last digit: " + swappedNum);
        scanner.close();
    }
}
