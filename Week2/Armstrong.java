import java.util.*;
    
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int dig;
        while(n>0){
            dig=n%10;
            sum+=(dig*dig*dig);
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Armstrong Number.\nNumber="+temp);
        } else {
            System.out.println("Not an Armstrong Number.\nNumber="+temp);
        }
        sc.close();
    }
}