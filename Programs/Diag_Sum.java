import java.util.Scanner;

public class Diag_Sum {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size of the Array:");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        System.out.println("Enter "+(n*n)+" Numbers:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i][i];
        }
        System.out.println("Sum of Primary Diagonal: "+sum);
      sc.close();
}
}
