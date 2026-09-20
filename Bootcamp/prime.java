import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n-1];
    for(int i=0;i<n-1;i++){
        a[i]=i+1;
    }
    for(int i=0;i<n-1;i++){
            int c=0;
            for(int j=2;j<n;j++){
                if(a[i]%j==0){
                    c++;
                }
            }
            if(c==1){
                System.out.print(a[i]+" ");
            }
        }
    }
    }

