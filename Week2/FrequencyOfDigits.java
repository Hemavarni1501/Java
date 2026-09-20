import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); 
        int n = sc.nextInt();
        int[] freq = new int[10];
        int temp=n; 
        while (n != 0) {
            int dig= n % 10;
            freq[dig]++;
            n /= 10;
        
        }
        System.out.println("Frequency of digits:");
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0)
            System.out.print(i + " --> " + freq[i] + ", ");
        }
        sc.close();
    }
}

