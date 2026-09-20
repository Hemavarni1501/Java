import java.util.Scanner;
public class String_Pattern_Matching {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String txt=s.nextLine();
        String pat=s.next();
        char[] a=txt.toCharArray();
        char[] p=pat.toCharArray();
        int in=txt.indexOf(pat);
        while(in!=-1){
            System.out.println(in+" index");
            in=txt.indexOf(pat,in+1);
        }
      /*  for(int i=0;i<=a.length-p.length;i++){
            String r="";
            for(int j=0;j<p.length;j++){
                
                    r+=a[i+j];
                
            }
            if(pat.equals(r)){
                System.out.println(i+" index");
            }
        }*/
    }
}
