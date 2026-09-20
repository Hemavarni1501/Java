import java.util.Arrays;
import java.util.Scanner;
public class remove_dup_wo_2d {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]==a[j]){
                a[j++]=a[i];
            }
        }
        a[j++]=a[a.length-1];
        for(int i=0;i<j;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
