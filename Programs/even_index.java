import java.util.Scanner;

public class even_index {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("The Even Index Elements of the Array is:");
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(a[i]);
            }
        }
        sc.close();
    }
}
