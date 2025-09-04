import java.util.*;

public class BreakContinue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==4){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
        sc.close();
    }
}