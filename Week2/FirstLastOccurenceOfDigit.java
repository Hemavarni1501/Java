
import java.util.Scanner;

public class FirstLastOccurenceOfDigit {
    public static int findFirstOccurrence(int num, int digit) {
    String numStr = Integer.toString(num);
    return numStr.indexOf(Integer.toString(digit));
}

public static int findLastOccurrence(int num, int digit) {
    String numStr = Integer.toString(num);
    return numStr.lastIndexOf(Integer.toString(digit));
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    System.out.print("Enter a digit: ");
    int digit = sc.nextInt();

    int firstIndex = findFirstOccurrence(num, digit);
    int lastIndex = findLastOccurrence(num, digit);

    System.out.println("First=" + (firstIndex + 1) + ", Last=" + (lastIndex + 1));
    sc.close();
}
}