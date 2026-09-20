import java.util.*;
public class Even_No_Digit {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        } 
        for(int i=0;i<n;i++){
    if(a[i]%2==0){
        System.out.print("Even Digit ");
    }
    else{
        System.out.print("Odd Digit ");
    }
    }
    }
}
