import java.util.Scanner;

public class mat_add {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size of the Array:");
        int r=sc.nextInt();
        System.out.println("Enter Col Size of the Array:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        int[][] b=new int[r][c];
        System.out.println("Enter Matrix A:"+(r*c)+" Numbers:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B:"+(r*c)+" Numbers:");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 b[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 res[i][j]= a[i][j]+b[i][j];
            }
        }
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
