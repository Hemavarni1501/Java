import java.util.Scanner;

public class Boundary_Elements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size of the Array:");
        int r=sc.nextInt();
        System.out.println("Enter Col Size of the Array:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter "+(r*c)+" Matrix Elements:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 a[i][j]=sc.nextInt();
            }
        }
            System.out.println("Boundary Elements of the Matrix are:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                        if(i==0 || i==r-1 || j==0 || j==c-1){
                            System.out.print(a[i][j]+" ");
                        } else {
                            System.out.print("  ");
                        }
                }
                System.out.println();
            }
        sc.close();
    }
}
