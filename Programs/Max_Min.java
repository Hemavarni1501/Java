import java.util.Scanner;

public class Max_Min {
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
        int max=a[0][0],min=a[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                 if(a[i][j]>max)max=a[i][j];
                 if(a[i][j]<min)min=a[i][j];
            }
        }
        System.out.println("Max: "+max+" Min: "+min);
        sc.close();
    }
}
