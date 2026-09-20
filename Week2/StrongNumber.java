
import java.util.Scanner;

public class StrongNumber {
    public static int fact(int f) {
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial *= i;
        }   
        return factorial;
    }
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter a Number to Check:");
        int n=ob.nextInt();
        int num=n,sum=0;
        int dig=0;
        while(n>0){
            dig=n%10;
            int fc=fact(dig);
            sum+=fc;
            n/=10;
        }
        if(sum==num){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        ob.close();
    }
}
