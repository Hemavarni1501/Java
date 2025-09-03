import java.util.*;

public class HouseStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int k;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-i; j++) {
                  System.out.print(" ");
                }
                for (int j = 1; j <= 2*i-1; j++) {

                  System.out.print("*");
                  
                }
                System.out.println();
            }
            k=2*n-1;
            int a;
           for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= k; j++) {
                    for(a=k/3;a>=j;a+=a){
                        if(a==j)
                        System.out.print("*");
                }
            }
                System.out.println();
            }
    }
}