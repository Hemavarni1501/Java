import java.util.Scanner;

public class Identity {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Size of the Array:");
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        System.out.println("Enter "+(n*n)+" Numbers:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        boolean isIdentity=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                        if((i==j&&a[i][j]!=1)||(i!=j&&a[i][j]!=0)){
                            isIdentity=false;
                            break;  }
                    }
            }
        if(isIdentity){
            System.out.println("The Matrix is an Identity Matrix.");  
        System.out.println("Identity Matrix is:");
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                    if(i==j){
                        System.out.print(a[i][j]+" ");
                    } else {
                        System.out.print("0 ");
                    }
            }
            System.out.println();
        }
         } else {
            System.out.println("The Matrix is Not an Identity Matrix.");
        } 
        sc.close();
    }
}
