import java.util.Scanner;

public class Lower_Tri_mat {
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
        System.out.println("Upper Triangle Matrix is:");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    if(i>=j){
                        System.out.print(a[i][j]+" ");
                    } else {
                        System.out.print("0 ");
                    }
            }
            System.out.println();
        }
        sc.close();
    }
}
