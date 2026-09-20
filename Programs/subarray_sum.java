import java.util.Scanner;

public class subarray_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int s = 0;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + a[j];
                if(sum == k){
                    s++;
                }
            }
        }
        System.out.println("Output: " + s);
        sc.close();
    }
}