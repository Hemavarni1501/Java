import java.util.Scanner;

public class Spiral {
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
        int t=0,b=r-1,l=0,ro=c-1;
        System.out.println("Spiral Traversal of the Matrix is:");
        while(t<=b && l<=ro){
            for(int i=l;i<=ro;i++){
                System.out.print(a[t][i]+" ");
            }
            t++;
            for(int i=t;i<=b;i++){
                System.out.print(a[i][ro]+" ");
            }
            ro--;
            if(t<=b){
                for(int i=ro;i>=l;i--){
                    System.out.print(a[b][i]+" ");
                }
                b--;
            }
            if(l<=ro){
                for(int i=b;i>=t;i--){
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }
        }
        sc.close();
    }
}
