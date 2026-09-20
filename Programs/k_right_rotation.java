import java.util.Scanner;

public class k_right_rotation {
    static void reverse(int[] a,int s, int e){
        while(s<e){
            int t=a[s];
            a[s]=a[e];
            a[e]=t;
            s++;
            e--;
        }
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter k value:");
        int k=sc.nextInt();
        k=k%a.length;
        reverse(a,0,a.length-1);
         reverse(a,k,a.length-1);
          reverse(a,0,k-1);
        for(int val:a){
            System.out.print(val+" ");
        }
        sc.close();
    }
}
