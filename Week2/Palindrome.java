import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        //Left to Right
        int temp=n;
        int num=n;
        int step=0;
        while(n>0){
            n=n/10;
            step++;
        }
        int c=0;
        int div=(int)Math.pow(10,step-1);
        while(div>0&&num>0){
            int dig=(temp/div)%10;

            //Right to Left
        int d=0;

        d=num%10;
            if(d==dig){
                c++;
            }
            num=num/10; 

            div=div/10;
        }
        if(c==step){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
