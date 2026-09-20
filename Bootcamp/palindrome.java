import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        char[] c=s.toCharArray();
        int i=0,j=n-1;
        while(i<j){
            if(c[i]=='-'){
                i++;
                continue;
            }
            if(c[i]!=c[j]){
                System.out.println("Not a Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
