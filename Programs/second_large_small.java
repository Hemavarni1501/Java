import java.util.Scanner;

public class second_large_small {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int smax=Integer.MIN_VALUE, smin=Integer.MAX_VALUE;
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

            if(a[i]<min){
                min=a[i];
                smin=min;
            }
            else if(a[i]<smin && a[i]!=min){
                smin=a[i];
            }
            if(a[i]>max){
                max=a[i];
                smax=max;
            }
            else if(a[i]>smax && a[i]!=max){
                smax=a[i];
            }
        }
        
        System.out.println("The Second Largest and Smallest of the Array is:");
        System.out.println("Max="+smax);
        System.out.println("Min="+smin);
        sc.close();
    }
    /*public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int smax=Integer.MIN_VALUE, smin=Integer.MAX_VALUE;
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
        for(int i=0;i<n;i++){
            if(a[i]==max||a[i]==min){
                continue;
            }
            if(a[i]>smax){
                smax=a[i];
            }
            if(a[i]<smin){
                smin=a[i];
            }
        }
        
        System.out.println("The Second Largest and Smallest of the Array is:");
        System.out.println("Max="+smax);
        System.out.println("Min="+smin);
        sc.close();
    }*/
}
