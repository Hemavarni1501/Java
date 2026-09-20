import java.util.Scanner;
public class str_rev {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);
        sc.close();
}
}