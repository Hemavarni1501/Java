import java.util.Scanner;
public class count_vowel_cons {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int v=0,c=0;
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                v++;}
            else {
                c++;}
        }
        System.out.println("Number of vowels: " + v);
        System.out.println("Number of consonants: " + c);
        sc.close();
}
}