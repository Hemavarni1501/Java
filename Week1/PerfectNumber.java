import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i;
    int[] a=new int[num];
    for (i = 1; i <num; i++) {
        if(num%i==0){
            a[i]=i;
        }
    }
    int sum=0;
    for (i = 0; i <num; i++) {
        sum+=a[i];
    }
    if(sum==num){
        System.out.println("Perfect Number");
    }
    else{
        System.out.println("Not a Perfect Number");
    }
    sc.close();
}
}
