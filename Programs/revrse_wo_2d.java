import java.util.Scanner;

public class revrse_wo_2d {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int s=0, e=a.length-1;
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
        for(int val:a){
            System.out.print(val+" ");
        }
        sc.close();
    }
}
