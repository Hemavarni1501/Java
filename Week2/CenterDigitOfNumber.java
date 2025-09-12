import java.util.*;
public class CenterDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String s = Integer.toString(num);
        int a=s.length();
        if(a%2!=0){
        int b=(a/2)+1;
        System.out.println(b);
        }
        else{
            System.out.println("-1");
        }
        sc.close();
    }
}


