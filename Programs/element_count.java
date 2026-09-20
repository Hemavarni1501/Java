import java.util.Scanner;

public class element_count {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int c=0,k;
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
         System.out.println("Enter the Key to Count:");
        k=sc.nextInt();
        System.out.println("The Count of "+k+" Numbers in the Array is:");
        for(int i=0;i<n;i++){
            if(a[i]==k){
                c++;
            }
        }
        System.out.println("Count="+c);
        sc.close();
    }
}
