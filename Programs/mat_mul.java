import java.util.Scanner;

public class mat_mul {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size of the Array 1:");
        int r1=sc.nextInt();
        System.out.println("Enter Col Size of the Array 1:");
        int c1=sc.nextInt();
        System.out.println("Enter Row Size of the Array 2:");
        int r2=sc.nextInt();
        System.out.println("Enter Col Size of the Array 2:");
        int c2=sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        if(r1==c2){
        System.out.println("Enter Matrix A:"+(r1*c1)+" Numbers:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B:"+(r2*c2)+" Numbers:");
         for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                 b[i][j]=sc.nextInt();
            }
        }
        int[][] res=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                 res[i][j]+= a[i][k]*b[k][j];
                }
            }
        }
         for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                 System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }}
        else{
            System.out.println("Matrix Multiplication Not Possible");
        }
        sc.close();
    }
}
