import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i); 
        }int st=0,en=str.length()-1;boolean a=true;
        String s=str.toLowerCase();
        System.out.println(s);
        while(st<en){
            if(s.charAt(st)!=s.charAt(en)){
                a=false;
                en--; st++;}
        }
        System.out.println(a?"P":"NP");
        if(a){System.out.println("P");}
        else{System.out.println("NP");}
       if(str.equals(rev))
        System.out.println("The string is a palindrome.");
       else
        System.out.println("The string is not a palindrome.");
        sc.close();
}
}