import java.util.Scanner;

public class Rev_trav {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size of the Array:");
        int r=sc.nextInt();
        System.out.println("Enter Col Size of the Array:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter "+(r*c)+" Numbers:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        for(int i=r-1;i>=0;i--){
            for(int j=c-1;j>=0;j--){
                 System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
