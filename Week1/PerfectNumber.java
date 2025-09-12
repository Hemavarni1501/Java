import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number to Check:");
    int num = sc.nextInt();
    int i;
    int sum=0;
    for (i = 1; i <num; i++) {
        if(num%i==0){
            sum+=i;
        }
    }
    if(sum==num){
        System.out.println("Perfect Number");
    }
    else{
        System.out.println("Not a Perfect Number");
    }
    sc.close();
}
}
