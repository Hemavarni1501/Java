import java.util.Scanner;

public class count_dup {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of the Array:");
        int n=sc.nextInt();
        int[] a=new int[n];
        int dc=0;
        System.out.println("Enter "+n+" Numbers:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ec=0, oc=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                ec++;
            } else {
                oc++;
            }
        }
        System.out.println("The Count of Even and Odd Numbers in the Array is:");
        System.out.println("Even="+ec);
        System.out.println("Odd="+oc);
        sc.close();
    }
}
