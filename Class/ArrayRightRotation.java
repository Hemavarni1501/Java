import java.util.*;
public class ArrayRightRotation{
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Size of the Array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        int i,j,temp;
        System.out.println("Enter "+size+ " Elements");
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The Given Array:");
        
        System.out.println();
        System.out.println("Enter Number of times the Array needs to be Rotated:");
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            temp=a[size-1];
            for(j=size-1;j>0;j--){
                a[j]=a[j-1];
        }
        a[0]=temp;
        }
        System.out.println("The Array After "+n+" Rotations:");
        for(i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}