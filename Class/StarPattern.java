import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
         int k=3,l=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){
          for(int j=1;j<=k;j++){
            System.out.print("*");
          }
          k++;
        }
        else {
            for(int j=1;j<=l;j++){
             System.out.print("*");
            }
            l++;
        }
         System.out.println();

        }
        sc.close();
    }
}
