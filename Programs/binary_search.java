import java.util.Arrays;
import java.util.Scanner;
public class binary_search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter key to search:");
        int k=sc.nextInt();
        Arrays.sort(a);
        int l=0,h=a.length-1,ind=-1;
        while(l<=h){
            int m=l+((h-l)/2);
            if(a[m]==k){
                ind=m;
                break;
            }
            else if(k<a[m]){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(ind!=-1){
            System.out.println("Key found in index:"+(ind+1));
        }
        else{
            System.out.println("Element not Found.");
        }
        sc.close();
    }
}