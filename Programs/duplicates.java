import java.util.Scanner;
public class duplicates {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String res = "";
        for(int i = 0;i<str.length();i++) {
            char ch=str.charAt(i);
            boolean dup=false;
            for(int j=0;j<res.length();j++){
                if(ch==res.charAt(j)){
                    dup=true;
                    break;
                }
            }
            if(!dup){
                res+=ch;
            }
        }
        System.out.println(res);
        sc.close();
}
}