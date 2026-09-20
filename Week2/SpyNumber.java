
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        int sum=0,prod=1;
        while (num != 0) {
            int digit = num % 10;
            prod=prod*digit;
            sum=sum+digit;
            num /= 10;
        }
        if(sum==prod){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
        obj.close();
    }
}
