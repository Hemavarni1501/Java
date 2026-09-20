import java.util.Scanner;

public class Row_Max_Sum {
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
        int max=Integer.MIN_VALUE,index=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                 sum+=a[i][j];
            }
            if(sum>max){
                index=i;
            }
            max=sum;
        }

        System.out.println("Max Sum: "+max+" at Row: "+(index+1));
        sc.close();
    }
}
