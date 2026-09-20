import java.util.Scanner;

public class String_Enc {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        String enc = str.replace(" ","");
        int l=enc.length();
        double n=Math.sqrt(l);
        int r=  (int)Math.floor(n);
        int c =  (int)Math.ceil(n);
        if(r*c<l){
            r++;
        }
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<c;i++){
        for(int j=0;j<r;j++){
            int ind=(j*c)+i;
            if(ind<l){
                sb.append(enc.charAt(ind));
            }
        }
        sb.append(" ");
       }
         System.out.println("Encoded String: " + sb.toString().trim());
        sc.close();
}
}
