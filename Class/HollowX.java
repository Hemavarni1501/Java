import java.util.*;

public class HollowX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=(n+(n-1));i++){
          for(int j=1;j<=(n+(n-1));j++){
            if(i==j||i+j==n+n){
              System.out.print("*");
            }
            else{
              System.out.print(" ");
            }
          }
          System.out.println();
        }
        sc.close();
    }
}
