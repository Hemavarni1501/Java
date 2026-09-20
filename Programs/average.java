import java.util.Scanner;

public class average {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int s=0;
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            s+=a[i];
        }
        System.out.println("The Sum and Average of the Array is:");
        System.out.println("Sum="+s);
        System.out.println("Average="+(s/n));
        sc.close();
    }
}
