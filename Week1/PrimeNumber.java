import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num<0){
        System.out.println("Invalid Input  \nNumber should be positive");
        return;
    }
    else{
    int sq=(int)Math.sqrt(num);
    boolean isPrime=true;
    for(int i=2;i<=sq;i++){
        if(num%i==0){
            isPrime=false;
            break;
        }
    }
    if(isPrime){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Not a Prime Number");
    }
}
    sc.close();
}
}

