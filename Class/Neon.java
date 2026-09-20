import java.util.*;
    
public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int sq = n*n;
        int dig=0;
        while(sq>0){
            dig=sq%10;
            sum+=dig;
         sq=sq/10;
        }
        if(sum==n){
            System.out.println("Neon Number.\nNumber="+n);
        } else {
            System.out.println("Not a Neon Number.\nNumber="+n);
        }
        sc.close();
    }
}