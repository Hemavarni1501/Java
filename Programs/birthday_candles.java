import java.util.Scanner;
import java.util.Arrays;

public class birthday_candles {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of candles:");
        int n=sc.nextInt();
        int[] a=new int[n];
      //  int max=a[0];
        System.out.println("Enter "+n+" Candle Heights:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int c=1;
        int j=n-1;
        while(a[j]==a[j-1]){
                c++;
                j--;
        }
      /*  int c=0;
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
                c=1;
            }
            else if(a[i]==max){
                c++;
            }
        }*/
       
        System.out.println("Tallest Candles Count:"+c);
        sc.close();
    }
}
