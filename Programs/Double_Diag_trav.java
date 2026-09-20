import java.util.Scanner;

public class Double_Diag_trav {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n*n Size of the Array:");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        System.out.println("Enter "+(n*n)+" Numbers:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Primary Diagonal Traversal");
        for(int i=0;i<n;i++){
            System.out.print(a[i][i]+" ");
        }
        System.out.println();
        System.out.println("Secondary Diagonal Traversal");
        for(int i=0,j=n-1;i<n;i++,j--){
            System.out.print(a[i][j]+" ");
        }
        sc.close();
    }
}
