import java.util.Scanner;

public class SumOfNumsDivBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
       int end=sc.nextInt();
         int sum=0;
        for(int i=start;i<=end;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

