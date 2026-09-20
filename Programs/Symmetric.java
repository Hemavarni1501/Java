import java.util.Scanner;

public class Symmetric {
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
        boolean flag=true;
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 if(a[i][j]!=a[j][i]){
                     flag=false;
                     break;
                 }
            }
        }
        if(flag){
            System.out.println("The Matrix is Symmetric.");
        } else {
            System.out.println("The Matrix is Not Symmetric.");
        }
        sc.close();
    }
}
