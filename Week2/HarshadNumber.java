import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sum = 0;
    int temp = num;
    while (num!= 0) {
        sum += num % 10;
        num /= 10;
    }
    if(temp%sum==0){
        System.out.println("Harshad Number");
    }
    else{
        System.out.println("Not a Harshad Number");
    }
    sc.close();
}
}
