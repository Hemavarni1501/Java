import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n= obj.nextInt();
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        System.out.println("Reversed Number:"+rev);
        obj.close();
    }
}
