import java.util.Scanner;

public class Rotate_90 {
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
        System.out.println("Matrix after 90 degree rotation is:");
         for(int i=0;i<c;i++){
            for(int j=r-1;j>=0;j--){
                    System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
