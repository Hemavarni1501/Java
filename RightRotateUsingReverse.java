import java.util.Arrays;
import java.util.Scanner;
public class RightRotateUsingReverse {
    public static int[] rev(int[] a,int st, int en){
        int s=a.length;
        int i=st,j=en;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return a;
    }
    public static int[] rot(int[] ar,int r){
        int s1=ar.length;
        int k=r%s1;
        rev(ar,0, k);
         rev(ar,0, r);
          rev(ar,r+1, k);
    return ar;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        int i,j,temp;
        System.out.println("Enter "+size+ " Elements");
        for(i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Given Array:"+(Arrays.toString(arr)));
        
        
        System.out.println("Enter Number of times the Array needs to be Rotated:");
        int n=sc.nextInt();
        System.out.println("Rotated array:"+Arrays.toString(rot(arr,n)));
        
        sc.close();
    }
}
