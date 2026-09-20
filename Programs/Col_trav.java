import java.util.Scanner;

public class Col_trav {
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
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                 System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        /* 
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
            */
        sc.close();
    }
}
