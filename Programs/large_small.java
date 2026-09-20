import java.util.Scanner;

public class large_small {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        
        System.out.println("The Largest and Smallest of the Array is:");
        System.out.println("Max="+max);
        System.out.println("Min="+min);
        sc.close();
    }
}
